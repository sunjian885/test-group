package com.sunjian.gui.lesson03;

import java.awt.*;

public class TestTextFiled {
    public static void main(String[] args) {
        new MyFrame();
    }
}

class MyFrame extends Frame{
    public MyFrame(){
        TextField textField = new TextField();
        add(textField);

        //按下回车触发事件
        MyListener myListener = new MyListener();
        textField.addActionListener(myListener);
        textField.setEchoChar('*');
        setVisible(true);
        pack();
    }
}
