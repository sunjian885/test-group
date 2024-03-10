package com.sunjian.gui.lesson05;

import javax.swing.*;

public class JFrameDemo {
    //初始化
    public void init(){
        JFrame jframe = new JFrame("这是一个JFrame窗口");
        jframe.setVisible(true);
        jframe.setBounds(100,100,200,200);
        //关闭事件
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JLabel jLabel = new JLabel("这是个JLabel");
        jframe.add(jLabel);
        jLabel.setHorizontalAlignment(SwingConstants.CENTER);
    }

    public static void main(String[] args) {
        new JFrameDemo().init();

    }
}
