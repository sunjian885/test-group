package com.sunjian.gui.lesson05;

import javax.swing.*;
import java.awt.*;

public class JRadioButtonDemo extends JFrame {
    public JRadioButtonDemo(){
        Container contentPane = this.getContentPane();
        JRadioButton jRadioButton01 = new JRadioButton("jRadioButton01");
        JRadioButton jRadioButton02 = new JRadioButton("jRadioButton02");
        JRadioButton jRadioButton03 = new JRadioButton("jRadioButton03");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(jRadioButton01);
        buttonGroup.add(jRadioButton02);
        buttonGroup.add(jRadioButton03);

        contentPane.add(jRadioButton01,BorderLayout.NORTH);
        contentPane.add(jRadioButton02,BorderLayout.CENTER);
        contentPane.add(jRadioButton03,BorderLayout.SOUTH);

        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JRadioButtonDemo();
    }
}
