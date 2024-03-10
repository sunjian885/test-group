package com.sunjian.gui.lesson05;

import javax.swing.*;
import java.awt.*;

public class JCheckBoxDemo extends JFrame {
    public JCheckBoxDemo(){
        Container contentPane = this.getContentPane();
        JCheckBox jCheckBox01 = new JCheckBox("jCheckBox01");
        JCheckBox jCheckBox02 = new JCheckBox("jCheckBox02");
        contentPane.add(jCheckBox01,BorderLayout.NORTH);
        contentPane.add(jCheckBox02,BorderLayout.SOUTH);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JCheckBoxDemo();
    }
}
