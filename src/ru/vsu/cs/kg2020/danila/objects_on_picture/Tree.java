package ru.vsu.cs.kg2020.danila.objects_on_picture;

import ru.vsu.cs.kg2020.danila.utils.Drawable;

import java.awt.*;

public class Tree implements Drawable {
    double width, height, x, y;
    double widthOfStump, heightOfLeaves;
    Color[] c;


    public Tree(double width, double height, double x, double y, double widthOfStump, double heightOfLeaves, Color[] c) {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
        this.widthOfStump = widthOfStump;
        this.heightOfLeaves = heightOfLeaves;
        this.c = c;
    }

    private void drawStamp(Graphics2D g, double heightOfLeaves, double height, double x, double y, double widthOfStump, Color[] c){
        g.setColor(c[0]);
        g.setStroke(new BasicStroke((int)(widthOfStump)));
        int hOfStump = (int)(height - heightOfLeaves);
        g.drawLine((int)x, (int)y, (int)x, (int)(y - hOfStump));
    }

    private void drawLeaves(Graphics2D g, double width, double height, double x, double y, double heightOfLeaves, Color[] c){
        g.setColor(c[1]);
        g.fillOval((int)(x - width / 2), (int)(y - height), (int)width, (int)heightOfLeaves);
    }

    @Override
    public void draw(Graphics2D g, int widthOfScreen, int heightOfScreen) {
        drawStamp(g,heightOfLeaves * heightOfScreen, height * heightOfScreen, x * widthOfScreen, y * heightOfScreen, widthOfStump * widthOfScreen, c);
        drawLeaves(g,width * widthOfScreen, height * heightOfScreen, x * widthOfScreen, y * heightOfScreen, heightOfLeaves * heightOfScreen, c);
    }
}