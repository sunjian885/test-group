package com.sunjian.gui.lesson03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorDemo {
    public static void main(String[] args) {
        new Calculator().loadFrame();
    }
}

class Calculator extends Frame{

    TextField num1,num2,sum;
    public void loadFrame(){
        num1 = new TextField(10);
        num2 = new TextField(10);
        sum = new TextField(20);
        Label label = new Label("+");
        Button button = new Button("=");
        button.addActionListener(new CalculatorListener());

        setSize(500,100);
        setLayout(new FlowLayout());
        add(num1);
        add(label);
        add(num2);
        add(button);
        add(sum);

        setSize(500,100);
        setVisible(true);
    }
    private class CalculatorListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            //获得加数和被加数
            int a = Integer.parseInt(num1.getText());
            int b = Integer.parseInt(num2.getText());
            sum.setText(""+(a+b));
            num1.setText("");
            num2.setText("");
        }
    }
}