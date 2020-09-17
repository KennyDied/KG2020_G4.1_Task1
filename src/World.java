import java.awt.*;

public class World implements Drawable{
    private int height;
    private int width;

    public World(Graphics2D g, int height, int width) {
        this.height = height;
        this.width = width;
    }

    private void drawGround (Graphics g, int height, int width){
        g.setColor(new Color (0, 166, 68));
        g.fillRect(0, height / 4, width, height);
    }

    private void drawSky (Graphics g, int height, int width){
        g.setColor(new Color(135, 206, 255));
        g.fillRect(0, 0, width, 7 * height / 10);
    }

    @Override
    public void draw(Graphics2D g) {
        drawGround(g, height, width);
        drawSky(g, height, width);
    }
}
