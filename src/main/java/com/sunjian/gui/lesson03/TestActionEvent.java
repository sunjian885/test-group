package com.sunjian.gui.lesson03;

import javafx.stage.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestActionEvent {
    public static void main(String[] args) {
        Frame frame = new Frame("test");
        Button button1 = new Button("button-1");
        Button button2 = new Button("button-1");
        MyListener myListener = new MyListener();
        button1.addActionListener(myListener);
        button2.addActionListener(myListener);
        frame.add(button1,BorderLayout.EAST);
        frame.add(button2,BorderLayout.WEST);
        frame.setSize(400,500);
        frame.setVisible(true);
        windowClose(frame);

    }

    private static void windowClose(Frame frame){
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

