package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JTextAreaDemo extends JFrame {
    public JTextAreaDemo(){
        Container contentPane = this.getContentPane();
        JTextArea jTextArea = new JTextArea(20,50);
        jTextArea.setText("hello word");
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        contentPane.add(jScrollPane);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextAreaDemo();
    }
}
