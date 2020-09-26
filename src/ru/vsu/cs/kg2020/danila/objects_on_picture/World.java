package ru.vsu.cs.kg2020.danila.objects_on_picture;

import ru.vsu.cs.kg2020.danila.utils.Drawable;

import java.awt.*;

public class World implements Drawable {
    private double height;
    private double width;

    public World(double height, double width) {
        this.height = height;
        this.width = width;
    }

    private void drawGround (Graphics g, double height, double width){
        g.setColor(new Color (0, 166, 68));
        g.fillRect(0, (int)(height / 4), (int)(width), (int)(height));
    }

    private void drawSky (Graphics g, double height, double width){
        g.setColor(new Color(135, 206, 255));
        g.fillRect(0, 0, (int)width, (int)(7 * height / 10));
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {
        drawGround(g, height * heightOfScreen, width * widthOfScreen);
        drawSky(g, height * heightOfScreen, width * widthOfScreen);
    }
}
