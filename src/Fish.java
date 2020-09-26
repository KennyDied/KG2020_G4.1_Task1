import java.awt.*;

public class Fish implements Drawable {
    private double height;
    private double width;
    private double x;
    private double y;
    private Color c;

    public Fish(double height, double width, double x, double y, Color c) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        this.c = c;
    }

    private void drawTailOfFish(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(c);
        g.setStroke(new BasicStroke(1.0f));

        int [] fishDotsX = {(int)x, (int)x, (int)(x + width / 2), (int)(x + width), (int)(x + width / 2)};
        int [] fishDotsY = {(int)y, (int)(y + height), (int)y, (int)(y + height / 2), (int)(y + height)};
        g.fillPolygon(fishDotsX, fishDotsY, 5);
    }

    private void drawEyesOfFish(Graphics2D g, double height, double width, double x, double y) {

        if (width > 0){
            g.setColor(Color.white);
            g.fillOval((int)(x + width / 2 - width / 10), (int)(y + height / 2 - width / 5), (int)(width / 5), (int)(height / 5));
            g.setColor(Color.black);
            g.drawOval((int)(x + width / 2 - width / 10), (int)(y + height / 2 - width / 5), (int)(width / 5), (int)(height / 5));
            g.fillOval((int)(x + width / 2 - width / 10), (int)(y + height / 2 - width / 5), (int)(width / 5), (int)(height / 8));
        } else {
            g.setColor(Color.white);
            g.fillOval((int)(x + width / 2 + width / 10), (int)(y + height / 2 + width / 5), (int)(- width / 5), (int)(- width / 5));
            g.setColor(Color.black);
            g.drawOval((int)(x + width / 2 + width / 10), (int)(y + height / 2 + width / 5), (int)(- width / 5), (int)(- width / 5));
            g.fillOval((int)(x + width / 2 + width / 10), (int)(y + height / 2 + width / 5), (int)(- width / 5), (int)(- width / 8));
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
//ы
//            g.setColor(Color.BLACK);
//            g.drawOval(x + width / 2, y + height / 3, - width / 5, - width / 5);
//            g.fillOval(x + width / 2 + width / 14, y + height / 3, - width / 7, - width / 7);
//        }
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {
        drawTailOfFish(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y * heightOfScreen);
        drawEyesOfFish(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y * heightOfScreen);
    }
}