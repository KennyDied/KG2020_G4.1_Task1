package ru.vsu.cs.kg2020.danila;

import ru.vsu.cs.kg2020.danila.utils.MainWindow;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MainWindow mw = new MainWindow();
        mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Dimension sSize = Toolkit.getDefaultToolkit ().getScreenSize ();
        mw.setSize (sSize);
        mw.setVisible(true);
    }
}