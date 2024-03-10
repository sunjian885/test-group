package com.sunjian.gui.lesson05;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageIconDemo extends JFrame {

    public ImageIconDemo(){
        JLabel label = new JLabel("ImageIcon");
        //获取图片地址
        URL url = ImageIconDemo.class.getResource("/test.jpg");

        ImageIcon imageIcon = new ImageIcon(url);
        label.setIcon(imageIcon);
        label.setHorizontalAlignment(SwingConstants.CENTER);

        Container container = new Container();
        container.add(label);
        container.setVisible(true);
        container.setBounds(100,100,500,500);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new ImageIconDemo();
    }
}


