import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.util.Random;

public class House {
    public int sizeOfHouse;
    public static void drawHouse(Graphics g, int height, int width, int x, int y, Color c){
        g.setColor(c);
        g.fillRect(x, y, width, height);
    }

    public static void drawWindow(Graphics g, int height, int width, int x, int y, Color c){
        g.setColor(c);
        Random random = new Random();
        int dx = x + random.nextInt(x + width / 2 + 1 - x);
        int dy = y + random.nextInt(y + height / 2 + 1 - y);
        int dwidth = width / 2 - dx + x + random.nextInt(width / 4);
        int dheight = height / 2 - dy + y + random.nextInt(height / 4);
        g.fillRect(x + dx, y - dy, dwidth, dheight);
    }

    public static void drawDoor(Graphics g, int height, int width, int x, int y, Color c){
        g.setColor(c);
        Random random = new Random();
        int dx = x + width / 2 + random.nextInt(x + width / 2)
    }

    public static void drawChimney(Graphics g, int height, int width, int x, int y, Color c){
        g.setColor(c);
    }
}