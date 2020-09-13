import java.awt.*;

public class Fish implements Drawable {
    Graphics2D g;
    int height;
    int width;
    int x;
    int y;

    public Fish(Graphics2D g, int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawTailOfFish(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.ORANGE);
        g.setStroke(new BasicStroke(1.0f));

        int [] fishDotsX = {x, x, x + width / 2, x + width, x + width / 2};
        int [] fishDotsY = {y, y + height, y, y + height / 2, y + height};
        g.fillPolygon(fishDotsX, fishDotsY, 5);
    }

    private void drawEyesOfFish(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x + width / 2, y + height / 3, width / 5, width / 5);

        g.setColor(Color.BLACK);
        g.drawOval(x + width / 2, y + height / 3, width / 5, width / 5);
        g.fillOval(x + width / 2 + width / 14, y + height / 3, width / 7, width / 7);
    }

    @Override
    public void draw(Graphics2D g) {
        drawTailOfFish(g, height, width, x, y);
        drawEyesOfFish(g, height, width, x, y);
    }
}
