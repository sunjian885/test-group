package com.sunjian.gui.lesson04;

import java.awt.*;

public class TestPaint {
    public static void main(String[] args) {
        new MyPaint().runLoad();
    }
}

class MyPaint extends Frame{
    public void runLoad(){
        setVisible(true);
        setBounds(200,200,500,500);
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(200,200,200,200);
        g.setColor(Color.pink);
        g.drawOval(100,100,300,300);
        g.setColor(Color.GREEN);
        g.drawRect(100,100,100,100);
    }
}
