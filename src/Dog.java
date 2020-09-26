import java.awt.*;

public class Dog implements Drawable {
    private double height;
    private double width;
    private double x;
    private double y;

    public Dog(double height, double width, double x, double y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawBodyOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(210, 105, 30));
        g.fillRect((int)(x + width / 10), (int)y,  (int)(3 * width / 4 - width / 10), (int)(height / 2));
    }

    private void drawHeadOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(210, 105, 30));
        g.fillRect((int)(x + 3 * width / 4), (int)(y + height / 12),  (int)(width / 4), (int)(height / 3));
    }

    private void drawEyesOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(Color.WHITE);
        for (int j = 0; j < 2; j++) {
            for (int i = 0; i < 2; i++) {
                g.fillRect((int)(x + 11 * width / (12 + 2 * i)), (int)(y + height / 6), (int)(width / 16), (int)(height / (16 + 10 * j)));
            }
            g.setColor(new Color(154, 205, 50));
        }
    }

    private void drawMouthOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(139, 69, 19));
        g.fillRect((int)(x + 5 * width / 6), (int)(y + 3 * height / 10), (int)(width / 12), (int)(height / 16));
    }

    private void drawEarsOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(210, 135, 50));
        g.fillRect((int)(x + 11 * width / 12), (int)y, (int)(width / 16), (int)(height / 12));
        g.fillRect((int)(x + 11 * width / 14), (int)y, (int)(width / 16), (int)(height / 12));
    }

    private void drawLegsOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(210, 135, 50));
        g.fillRect((int)(x + width / 4), (int)(y + height / 2), (int)(width / 12), (int)(45 * height / 100));
        g.fillRect((int)(x + 11 * width / 18), (int)(y + height / 2), (int)(width / 12), (int)(45 * height / 100));

        g.setColor(new Color(210, 105, 30));
        g.fillRect((int)(x + width / 5), (int)(y + height / 2), (int)(width / 12), (int)(height / 2));
        g.fillRect((int)(x + 11 * width / 20), (int)(y + height / 2), (int)(width / 12), (int)(height / 2));
    }

    private void drawTailOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(210, 135, 50));
        g.fillRect((int)x, (int)(y + height / 6), (int)(width / 10), (int)(height / 6));
    }

    private void drawCollarOfDog(Graphics2D g, double height, double width, double x, double y) {
        g.setColor(new Color(255, 20, 147));
        g.setStroke(new BasicStroke((int)(width / 50f)));
        g.drawLine((int)(x + 3 * width / 4), (int)(y + height / 12), (int)(x + 3 * width / 4), (int)(y + 5 * height / 12));
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {
        drawBodyOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawLegsOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawTailOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawHeadOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawEyesOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawEarsOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y* heightOfScreen);
        drawMouthOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y * heightOfScreen);
        drawCollarOfDog(g, height * heightOfScreen, width * widthOfScreen, x * widthOfScreen, y * heightOfScreen);
    }
}