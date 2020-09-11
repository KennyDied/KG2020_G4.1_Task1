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

    }

    private void drawHeadOfDog(Graphics2D g, int height, int width, int x, int y) {

    }

    private void drawLegsOfDog(Graphics2D g, int height, int width, int x, int y) {

    }

    private void drawTailOfDog(Graphics2D g, int height, int width, int x, int y) {

    }



    @Override
    public void draw(Graphics2D g) {

    }
}
