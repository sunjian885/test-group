package com.sunjian.gui.lesson03;

import javafx.stage.Window;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class MyListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("________");
    }
}

