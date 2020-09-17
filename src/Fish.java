import java.awt.*;

public class Fish implements Drawable {
    private int height;
    private int width;
    private int x;
    private int y;
    private Color c;

    public Fish(int height, int width, int x, int y, Color c) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        this.c = c;
    }

    private void drawTailOfFish(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(c);
        g.setStroke(new BasicStroke(1.0f));

        int [] fishDotsX = {x, x, x + width / 2, x + width, x + width / 2};
        int [] fishDotsY = {y, y + height, y, y + height / 2, y + height};
        g.fillPolygon(fishDotsX, fishDotsY, 5);
    }

    private void drawEyesOfFish(Graphics2D g, int height, int width, int x, int y) {

        if (width > 0){
            g.setColor(Color.white);
            g.fillOval(x + width / 2 - width / 10, y + height / 2 - width / 5, width / 5, width / 5);
            g.setColor(Color.black);
            g.drawOval(x + width / 2 - width / 10, y + height / 2 - width / 5, width / 5, width / 5);
            g.fillOval(x + width / 2 - width / 10, y + height / 2 - width / 5, width / 8, width / 8);
        } else {
            g.setColor(Color.white);
            g.fillOval(x + width / 2 + width / 10, y + height / 2 + width / 5, (-1) * width / 5, (-1) * width / 5);
            g.setColor(Color.black);
            g.drawOval(x + width / 2 + width / 10, y + height / 2 + width / 5, (-1) * width / 5, (-1) * width / 5);
            g.fillOval(x + width / 2 + width / 10, y + height / 2 + width / 5, (-1) * width / 8, (-1) * width / 8);
        }
//        if (width > 0) {
//            g.fillOval(x + width / 2, y + height / 3, width / 5, width / 5);
//
//            g.setColor(Color.BLACK);
//            g.drawOval(x + width / 2, y + height / 3, width / 5, width / 5);
//            g.fillOval(x + width / 2 + width / 14, y + height / 3, width / 7, width / 7);
//        }
//        else {
//            g.setColor(Color.WHITE);
//            g.fillOval(x + width / 2, y + height / 3, - width / 5, - width / 5);
//
//            g.setColor(Color.BLACK);
//            g.drawOval(x + width / 2, y + height / 3, - width / 5, - width / 5);
//            g.fillOval(x + width / 2 + width / 14, y + height / 3, - width / 7, - width / 7);
//        }
    }

    @Override
    public void draw(Graphics2D g) {
        drawTailOfFish(g, height, width, x, y);
        drawEyesOfFish(g, height, width, x, y);
    }
}