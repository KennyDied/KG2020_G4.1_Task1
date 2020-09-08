import javax.swing.JPanel;
import java.awt.*;



public class DrowPanel extends JPanel {

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g.create();
        //drawSun(gr, 300, 300, 50, 100, 100, Color.ORANGE);
        drawHouse(gr, 300, 300, 10000, Color.BLACK);

    }

    public static void drawSun(Graphics g, int x, int y, int r, int R, int n, Color c){
        g.setColor(c);
        g.fillOval(x - r,y - r,r + r,r + r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1 = r * Math.cos(da * i);
            double dy1 = r * Math.sin(da * i);
            double dx2 = R * Math.cos(da * i);
            double dy2 = R * Math.sin(da * i);

            g.drawLine(x + (int)dx1, y + (int)dy1, x + (int)dx2, y + (int)dy2);
        }
    }

    public static void drawHouse(Graphics g, int x, int y, int size, Color c){
        g.setColor(c);
//        g.fillRect(x, y, (int) Math.sqrt(size), (int)Math.sqrt(size));
//        g.drawLine(x, y, (int) (x + Math.sqrt(size)/2), y-50);
//        g.drawLine((int) (x + Math.sqrt(size)/2), y-50, (int) (x +Math.sqrt(size)), y);
//        g.drawLine(x, y, (int)(x+Math.sqrt(2)), y);
//        g.fill();

    }

}