import java.awt.*;

public class Lake implements Drawable{
    private double x;
    private double y;
    private double height;
    private double width;

    public Lake(double x, double y, double height, double width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    private void drawLake(Graphics2D g, double x, double y, double width, double height){
        g.setStroke(new BasicStroke((int)(width / 110)));
        g.setColor(new Color(70, 130, 180));
        g.drawOval((int)x, (int)y, (int)width, (int)height);

        g.setColor(new Color(0, 206,209));
        g.fillOval((int)x, (int)y, (int)width, (int)height);
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {

        drawLake(g, x * widthOfScreen, y * heightOfScreen, width * widthOfScreen, height * heightOfScreen);
    }
}