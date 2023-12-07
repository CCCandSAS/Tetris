package com.company;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {
        MainWindows mainWindow = new MainWindows();
        mainWindow.setTitle("Tetris");
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setSize(250, 600);
        mainWindow.setVisible(true);
        mainWindow.getBlocksPanel().move();
    }
}
