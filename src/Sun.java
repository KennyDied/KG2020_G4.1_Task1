import java.awt.*;
import java.awt.geom.Line2D;

public class Sun implements Drawable {
    private int x;
    private int y;
    private int r;
    private int raysR;
    private int n;

    public Sun(Graphics2D g, int x, int y, int r, int raysR, int n, Color orange) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.raysR = raysR;
        this.n = n;
    }

    private void drawSun(Graphics2D g, int x, int y, int r, int R, int n) {
        g.setColor(Color.YELLOW);
        g.fillOval(x - r, y - r, r + r, r + r);
        double da = 2 * Math.PI / n;

        float[] dashl = {5, 20};
        BasicStroke pen4 = new BasicStroke(7, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL, 15, dashl, 0);
        g.setStroke(pen4);
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);
            g.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }

    @Override
    public void draw(Graphics2D g) {
            drawSun(g, x, y, r, raysR, n);
    }
}