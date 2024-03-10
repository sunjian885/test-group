package com.sunjian.gui.lesson01;

import java.awt.*;

public class TestPanel {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Panel panel = new Panel();
        //设置布局
        frame.setLayout(null);
        frame.setBounds(300,300,500,500);
        frame.setBackground(Color.green);
        //设置panel
        panel.setBounds(50,50,400,400);
        panel.setBackground(Color.yellow);
        frame.add(panel);

        frame.setVisible(true);

    }
}
