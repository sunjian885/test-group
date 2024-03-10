package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JTextFieldDome extends JFrame {
    public JTextFieldDome(){
        Container contentPane = this.getContentPane();
        JTextField jTextField = new JTextField("");
        JTextField jTextField02 = new JTextField("",40);

        contentPane.add(jTextField,BorderLayout.NORTH);
        contentPane.add(jTextField02,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JTextFieldDome();
    }
}
