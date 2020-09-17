import java.awt.*;

public class Lake implements Drawable{
    int x;
    int y;
    int height;
    int width;

    public Lake(Graphics2D g, int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private void drawLake(Graphics2D g, int x, int y, int width, int height){
        g.setStroke(new BasicStroke(width / 110));
        g.setColor(new Color(70, 130, 180));
        g.drawOval(x, y, width, height);

        g.setColor(new Color(0, 206,209));
        g.fillOval(x, y, width, height);
    }

    @Override
    public void draw(Graphics2D g) {
    drawLake(g, x, y, width, height);
    }
}
