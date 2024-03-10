package com.sunjian.gui.lesson02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFlowLayOut {
    public static void main(String[] args) {
        Frame frame = new Frame("TestFlowLayOut");
        Button btn1 = new Button("btn1");
        Button btn2 = new Button("btn2");
        Button btn3 = new Button("btn3");
        Button btn4 = new Button("btn4");
        Button btn5 = new Button("btn5");
        //FlowLayOut 流式布局
        frame.setLayout(new FlowLayout());
        //左对齐
        // frame.setLayout(new FlowLayout(FlowLayout.LEFT));
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);
        frame.add(btn5);
        frame.setVisible(true);
        frame.setSize(600,800);

        frame.addWindowListener(new WindowAdapter(){

            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
