package com.sunjian.gui.lesson06;

import javax.swing.*;
import java.awt.*;

public class JComboBoxDemo extends JFrame {
    public JComboBoxDemo(){
        Container contentPane = this.getContentPane();
        JComboBox jComboBox = new JComboBox();
        jComboBox.addItem(null);
        jComboBox.addItem("项目立项");
        jComboBox.addItem("需求评审");
        jComboBox.addItem("设计评审");
        jComboBox.addItem("用例评审");
        jComboBox.addItem("测试阶段");
        jComboBox.addItem("发布上线");
        contentPane.add(jComboBox);
        this.setVisible(true);
        this.setSize(500,300);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new JComboBoxDemo();
    }
}
