import java.awt.*;

public class Sun implements Drawable {
    private double x;
    private double y;
    private double r;
    private double raysR;
    private double n;
    Color c;

    public Sun(double x, double y, double r, double raysR, double n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.raysR = raysR;
        this.n = n;
        this.c = c;
    }

    private void drawSun(Graphics2D g, double x, double y, double r, double R, double n) {
        g.setColor(c);
        g.fillOval((int)(x - r), (int)(y - r), (int)(r + r), (int)(r + r));
        double da = 2 * Math.PI / n;

        float[] rays = {5, 20};
        BasicStroke pen4 = new BasicStroke((int)(r / 10), BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 15, rays, 0);
        g.setStroke(pen4);
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine((int)(x + (int) dx1), (int)(y + (int) dy1), (int)(x + (int) dx2), (int)(y + (int) dy2));
        }
    }

    @Override
    public void draw(Graphics2D g, int heightOfScreen, int widthOfScreen) {
            drawSun(g, x * widthOfScreen, y * heightOfScreen, r * heightOfScreen, raysR * heightOfScreen, n);
    }
}