package com.sunjian.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
    public static void main(String[] args) {
        Frame frame = new Frame("孙健");
        frame.setVisible(true);
        frame.setBackground(Color.green);
        frame.setSize(500,500);
        frame.setLocation(30,50);
        frame.setLayout(new FlowLayout());
        Button button = new Button("确定");
        button.setSize(222,333);
        frame.add(button,BorderLayout.CENTER);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
