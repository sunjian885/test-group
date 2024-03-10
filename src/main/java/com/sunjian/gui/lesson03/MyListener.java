package com.sunjian.gui.lesson03;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField field = (TextField)e.getSource();
        System.out.println(field.getText());
        field.setText("");
    }

}
