package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JPasswordFieldDome extends JFrame {
    public JPasswordFieldDome(){
        Container contentPane = this.getContentPane();
        JPasswordField jPasswordField = new JPasswordField();
        jPasswordField.setEchoChar('*');
        contentPane.add(jPasswordField);

        this.setVisible(true);
        this.setSize(100,100);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JPasswordFieldDome();
    }
}
