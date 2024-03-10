package com.sunjian.gui.lesson02;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ExerciseDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("TestLayOut");
        frame.setVisible(true);
        frame.setLocation(200,200);
        frame.setSize(700,600);
        //4个面板
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2,1));
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2,2));
        frame.setLayout(new GridLayout(2,1));

        panel1.add(new Button("EAST-1"),BorderLayout.EAST);
        panel1.add(new Button("WEST-1"),BorderLayout.WEST);
        panel2.add(new Button("test-1"));
        panel2.add(new Button("test-2"));
        panel1.add(panel2,BorderLayout.CENTER);

        panel3.add(new Button("EAST-2"),BorderLayout.EAST);
        panel3.add(new Button("WEST-2"),BorderLayout.WEST);
        for(int i=0;i<4;i++){
            panel4.add(new Button("button"+i));
        }
        panel3.add(panel4,BorderLayout.CENTER);
        frame.add(panel1);
        frame.add(panel3);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

    }
}
