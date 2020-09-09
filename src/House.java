import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.Random;

public class House implements Drawable {
    Graphics2D g;
    int height;
    int width;
    int x;
    int y;


    public House(Graphics2D g, int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private static void drawBodyOfHouse(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, width, height);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5.0f));
        g.drawLine(x + width, y, x + width, y + height);
        g.drawLine(x, y, x, y + height);
        g.drawLine(x, y + height, x + width, y + height);
    }

    private static void drawWindow(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.CYAN);
        int windX = x + width / 6;
        int windY = y + height / 6;
        int windHeight = height / 2;
        int windWidth = width / 4;
        g.fillRect(windX, windY, windWidth, windHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5.0f));
        
        g.drawLine(windX, windY,windX + windWidth, windY);
        g.drawLine(windX, windY, windX, windY +  height / 2);
        g.drawLine(windX, windY +  height / 2, windX + windWidth, windY +  height / 2);
        g.drawLine(windX + windWidth, windY +  height / 2, windX + windWidth, windY);
        g.drawLine( ((windX + windWidth) + (windX))/2, windY, ((windX + windWidth) + (windX))/2, windY +  height / 2);
        g.drawLine(windX, y + height / 3, windX + windWidth, y + height / 3  );
    }

    private static void drawDoor(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.PINK);
        g.setStroke(new BasicStroke(5.0f));
        int doorX = x + width / 2 + width / 8;
        int doorY = y + height / 3;
        int doorHeight = y + height - doorY;
        int doorWidth = width / 4;
        g.fillRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(4.0f));
        g.drawRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.MAGENTA);
        g.fillOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2.0f));
        g.drawOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
    }

    private static void drawChimney(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.ORANGE);
        g.fillRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);

        g.setStroke(new BasicStroke(3.0f));
        g.setColor(Color.BLACK);
        g.drawRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);
    }

    private static void drawRoof(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.PINK);
        g.setStroke(new BasicStroke(5.0f));
        int ax = x + width / 2;
        int bx = x;
        int cx = x + width;
        int ay = y - height / 4;
        int by = y;
        int cy = y;
        int[] roofX = {ax, bx, cx};
        int[] roofY = {ay, by, cy};
        g.fillPolygon(roofX, roofY, 3);

        g.setColor(Color.BLACK);
        g.drawLine(x, y, cx, y);
        g.drawLine(x, y, ax, ay);
        g.drawLine(ax, ay, cx, cy);
    }

    @Override
    public void draw(Graphics2D g) {
        drawBodyOfHouse(g, height,width,x,y);
        drawWindow(g, height,width,x,y);
        drawDoor(g, height,width,x,y);
        drawChimney(g, height, width,x,y);
        drawRoof(g, height, width, x, y);
    }
}