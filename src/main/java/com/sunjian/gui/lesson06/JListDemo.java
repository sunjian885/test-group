package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JListDemo extends JFrame {
    public JListDemo(){
        Container contentPane = this.getContentPane();
        String[] strings = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        JList list = new JList(strings);
        contentPane.add(list);
        this.setVisible(true);
        this.setSize(500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JListDemo();
    }
}
