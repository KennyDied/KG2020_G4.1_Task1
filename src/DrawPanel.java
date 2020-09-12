import javax.swing.JPanel;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        World world = new World((Graphics2D) g, getHeight(), getWidth());
        world.draw((Graphics2D) g);

        House house = new House((Graphics2D) g,250,400,1200,400);
        house.draw((Graphics2D) g);

        Sun sun = new Sun((Graphics2D) g, 150, 150, 50, 100, 20, Color.ORANGE);
        sun.draw((Graphics2D) g);

        Dog dog = new Dog((Graphics2D) g, 100, 250, 150, 600);
        dog.draw((Graphics2D) g);
    }
}