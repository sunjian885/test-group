package com.sunjian.gui.lesson04;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;

public class TestMouseListener {
    public static void main(String[] args) {
        new MyFrame("hua");

    }
}
class MyFrame extends Frame {
    ArrayList points;
    public MyFrame(String s){
        setBounds(100,100,500,400);
        //存放鼠标惦记的点
        points = new ArrayList<>();
        //鼠标监听器，正对这个窗口
        this.addMouseListener(new MyMouseListener());
        setVisible(true);
    }


    @Override
    public void paint(Graphics g) {
        //画画，监听鼠标的事件
        Iterator iterator = points.iterator();
        while (iterator.hasNext()){
            Point point = (Point)iterator.next();
            g.setColor(Color.green);
            g.fillOval(point.x,point.y,10,10);
        }
    }

    //添加一个点到界面上
    public void addPaint(Point point){
        points.add(point);
    }


    private class MyMouseListener extends MouseAdapter{
        @Override
        public void mousePressed(MouseEvent e) {
            MyFrame frame = (MyFrame)e.getSource();
            frame.addPaint(new Point(e.getX(),e.getY()));
            //每次点击鼠标需要重新画一遍
            frame.repaint();
        }
    }
}
