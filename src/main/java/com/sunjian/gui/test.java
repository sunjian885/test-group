package com.sunjian.gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class test {
    public static void main(String[] args) {
        Frame frame = new Frame("孙健");
        frame.setVisible(true);
        frame.setBackground(Color.green);
        frame.setSize(400,500);
        frame.setLocation(30,50);
        Button button = new Button();
        button.setName("确定");
        button.setSize(22,33);
        frame.add(button,BorderLayout.CENTER);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
