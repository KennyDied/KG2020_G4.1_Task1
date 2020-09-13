import java.awt.*;

public class Fish implements Drawable {
    Graphics2D g;
    int height;
    int width;
    int x;
    int y;

    public Fish(Graphics2D g, int height, int width, int x, int y) {
        this.g = g;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawTailOfFish(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.YELLOW);
        g.fillRect(width / 4, 3 * height / 4, height / 12, width / 32);

    }

    @Override
    public void draw(Graphics2D g) {
        drawTailOfFish(g, height, width, x, y);
    }
}
