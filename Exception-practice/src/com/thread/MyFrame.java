package com.thread;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame(){
        setSize(500,300);
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        MyFrame frame = new MyFrame();
    }
}

