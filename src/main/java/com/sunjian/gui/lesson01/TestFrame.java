package com.sunjian.gui.lesson01;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame {
    public static void main(String[] args) {
        //frame 窗口
        Frame frame = new Frame("孙健的第一个界面窗口");
        frame.setVisible(true);
        frame.setSize(500,600);
        frame.setLocation(300,200);
        frame.setBackground(Color.green);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
