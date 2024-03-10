package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo02 extends JFrame {
    public JComboBoxDemo02(){
        Container contentPane = this.getContentPane();
        String[] strings = {"monday","tuesday","wednesday","thursday","friday","saturday","sunday"};
        java.util.List<String> list = new List(strings);
    }

    public static void main(String[] args) {

    }
}
