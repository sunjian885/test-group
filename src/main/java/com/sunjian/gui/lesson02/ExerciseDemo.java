package com.sunjian.gui.lesson02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Demo {
    public static void main(String[] args) {
        Frame frame = new Frame("TestLayOut");
        frame.setVisible(true);
        frame.setSize(600,700);


        Button bt1 = new Button("shang");
        Button bt2 = new Button("xia");

        Panel panel = new Panel();
        panel.add(bt1);
        panel.add(bt2);

        frame.add(panel);
        frame.setLayout(new GridLayout(2,1));

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
