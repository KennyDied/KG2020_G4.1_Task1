package ru.vsu.cs.kg2020.danila.utils;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    public MainWindow() throws HeadlessException {
        DrawPanel dp = new DrawPanel();
        this.add(dp);
    }
}
