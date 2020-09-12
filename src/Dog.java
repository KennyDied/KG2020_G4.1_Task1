import java.awt.*;

public class Dog implements Drawable {
    Graphics2D g;
    int height;
    int width;
    int x;
    int y;

    public Dog(Graphics2D g, int height, int width, int x, int y) {
        this.g = g;
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }


    private void drawBodyOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x + width / 10, y,  3 * width / 4 - width / 10, height / 2);

    }

    private void drawHeadOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x + 3 * width / 4, y + height / 12, width / 4, height / 3);
    }

    private void drawEyesOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.CYAN);
        g.fillRect(x + 11 * width / 12, y + height / 6, width / 16, height / 16);
        g.fillRect(x + 11 * width / 14, y + height / 6, width / 16, height / 16);

        g.setColor(Color.WHITE);
        g.fillRect(x + 11 * width / 12, y + height / 6, width / 26, height / 26);
        g.fillRect(x + 11 * width / 14, y + height / 6, width / 26, height / 26);



    }

    private void drawMouthOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x + 5 * width / 6, y + 3 * height / 10, width / 12, height / 16);
    }

    private void drawEarsOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x + 11 * width / 12, y, width / 16, height / 12);
        g.fillRect(x + 11 * width / 14, y, width / 16, height / 12);
    }

    private void drawLegsOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x + width / 5, y + height / 2, width / 12, height / 2);
        g.fillRect(x + 11 * width / 20, y + height / 2, width / 12, height / 2);
    }

    private void drawTailOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.orange);
        g.fillRect(x, y + height / 6, width / 10, height / 6);
    }

    private void drawCollarOfDog(Graphics2D g, int height, int width, int x, int y) {
        g.setColor(Color.RED);
        g.setStroke(new BasicStroke(width / 50f));
        g.drawLine(x + 3 * width / 4, y + height / 12, x + 3 * width / 4, y + 5 * height / 12);
    }


    @Override
    public void draw(Graphics2D g) {
        drawBodyOfDog(g, height, width, x, y);
        drawLegsOfDog(g, height, width, x, y);
        drawTailOfDog(g, height, width, x, y);
        drawHeadOfDog(g, height, width, x, y);
        drawEyesOfDog(g, height, width, x, y);
        drawEarsOfDog(g, height, width, x, y);
        drawMouthOfDog(g, height, width, x, y);
        drawCollarOfDog(g, height, width, x, y);
    }
}
