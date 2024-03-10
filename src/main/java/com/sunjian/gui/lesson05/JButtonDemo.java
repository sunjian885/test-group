package com.sunjian.gui.lesson05;

import javax.swing.*;
import java.awt.*;

public class JButtonDemo extends JFrame {
    public JButtonDemo(){
        Container container = this.getContentPane();
        JButton button = new JButton("hello");
        container.add(button);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JButtonDemo();
    }
}
