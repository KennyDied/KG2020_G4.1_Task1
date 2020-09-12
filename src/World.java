import java.awt.*;

public class World implements Drawable{
    Graphics2D g;
    int height;
    int width;

    public World(Graphics2D g, int height, int width) {
        this.g = g;
        this.height = height;
        this.width = width;
    }

    private void drawGround (Graphics g, int height, int width){
        g.setColor(new Color (9,254,128));
        g.fillRect(0, height / 4, width, height);
    }

    private void drawSky (Graphics g, int height, int width){
        g.setColor(new Color(0,214,255));
        g.fillRect(0, 0, width, height / 2);
    }


    @Override
    public void draw(Graphics2D g) {
        drawGround(g, height, width);
        drawSky(g, height, width);
    }
}
