package com.sunjian.gui.lesson05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogDemo extends JFrame {

    public DialogDemo(){
        this.setVisible(true);
        this.setBounds(100,100,200,200);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //容器
        Container container = this.getContentPane();
        //绝对布局
        container.setLayout(null);
        JButton button = new JButton("ok");
        button.setBounds(50,50,50,30);
        //监听器
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new MyDialogDemo();
            }
        });
        container.add(button);

    }

    public static void main(String[] args) {
        new DialogDemo();
    }
}

class MyDialogDemo extends JFrame{

    public MyDialogDemo(){
        this.setVisible(true);
        this.setBounds(120,120,100,100);
        Container container = new Container();
        container.setLayout(null);
        JLabel label = new JLabel("test！");
        container.add(label);
    }
}