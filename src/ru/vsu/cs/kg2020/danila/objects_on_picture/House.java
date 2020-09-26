package ru.vsu.cs.kg2020.danila.objects_on_picture;

import ru.vsu.cs.kg2020.danila.utils.Drawable;

import java.awt.*;

public class House implements Drawable {
    private double height;
    private double width;
    private double x;
    private double y;

    public House(double height, double width, double x, double y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawBodyOfHouse(Graphics2D g, double height, double width, double x, double y){
        g.setColor(new Color(238, 130, 98));
        g.fillRect((int)x, (int)y, (int)width, (int)height);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke((int)(width / 80)));
        g.drawLine((int)(x + width), (int)y, (int)(x + width), (int)(y + height));
        g.drawLine((int)x, (int)y, (int)x, (int)(y + height));
        g.drawLine((int)x, (int)(y + height), (int)(x + width), (int)(y + height));
    }

    private void drawWindow(Graphics2D g, double height, double width, double x, double y){
        g.setColor(new Color(224, 255, 255));
        int windX = (int)(x + width / 6);
        int windY = (int)(y + height / 6);
        int windHeight = (int)(height / 2);
        int windWidth = (int)(width / 4);
        g.fillRect(windX, windY, windWidth, windHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke((int)(width / 100)));

        g.drawLine(windX, windY,windX + windWidth, windY);
        g.drawLine(windX, windY, windX, (int)(windY +  height / 2));
        g.drawLine(windX, (int)(windY +  height / 2), windX + windWidth, (int)(windY +  height / 2));
        g.drawLine(windX + windWidth, (int)(windY +  height / 2), windX + windWidth, windY);
        g.drawLine( ((windX + windWidth) + (windX))/2, windY, ((windX + windWidth) + (windX))/2, (int)(windY +  height / 2));
        g.drawLine(windX, (int)(y + height / 3), windX + windWidth, (int)(y + height / 3)  );
    }

    private void drawDoor(Graphics2D g, double height, double width, double x, double y){
        g.setColor(new Color(197, 130, 45));
        g.setStroke(new BasicStroke((int)(width / 100)));
        int doorX = (int)(x + width / 2 + width / 8);
        int doorY = (int)(y + height / 3);
        int doorHeight = (int)(y + height - doorY);
        int doorWidth = (int)(width / 4);
        g.fillRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke((int)(width / 120)));
        g.drawRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(new Color(238, 220, 130));
        g.fillOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke((int)(width / 130)));
        g.drawOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
    }

    private void drawChimney(Graphics2D g, double height, double width, double x, double y){
        g.setColor(new Color(205, 85, 85));
        g.fillRect((int)(x + 3 * width / 4), (int)(y - height / 4), (int)(width / 6), (int)(height / 4));

        g.setStroke(new BasicStroke((int)(width / 100)));
        g.setColor(Color.BLACK);
        g.drawRect((int)(x + 3 * width / 4), (int)(y - height / 4), (int)(width / 6), (int)(height / 4));
    }

    private void drawRoof(Graphics2D g, double height, double width, double x, double y){
        g.setColor(new Color(205, 38, 38));
        g.setStroke(new BasicStroke((int)(width / 80)));
        int[] roofX = {(int)(x + width / 2), (int)x, (int)(x + width)};
        int[] roofY = {(int)(y - height / 4), (int)y, (int)y};
        g.fillPolygon(roofX, roofY, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(roofX, roofY, 3);
    }

    private void drawAddress(Graphics2D g, double height, double width, double x, double y){

        g.setColor(new Color(98, 157, 217));
        g.fillRect((int)(x + width / 2 + width / 8), (int)(y + height / 6), (int)(width / 4), (int)(height / 8));

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke((int)(width / 120)));
        g.drawRect((int)(x + width / 2 + width / 8), (int)(y + height / 6), (int)(width / 4), (int)(height / 8));

        Font newFont = new Font("Arial", Font.BOLD + Font.PLAIN, (int)(width / 30));
        g.setFont(newFont);
        g.drawString("Улица Лесная", (int)(x + width / 2 + width / 7), (int)(y + height / 4));
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {
        drawBodyOfHouse(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
        drawWindow(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
        drawDoor(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
        drawChimney(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
        drawRoof(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
        drawAddress(g, heightOfScreen * height, widthOfScreen * width, widthOfScreen * x,heightOfScreen * y);
    }
}