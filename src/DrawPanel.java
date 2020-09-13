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

        Sun sun = new Sun((Graphics2D) g, getWidth() / 10, getWidth() / 10, getHeight() / 12, getHeight() / 6, 20, Color.ORANGE);
        sun.draw((Graphics2D) g);

        Tree tree = new Tree((Graphics2D) g, 15, getWidth(), getHeight());
        tree.draw((Graphics2D) g);

        Lake lake = new Lake((Graphics2D) g, getWidth() / 4, 80 * getHeight() / 100, getWidth() / 4, getHeight() /8);
        lake.draw((Graphics2D) g);

        House house = new House((Graphics2D) g,getHeight() / 4,getWidth() / 4,65 * getWidth() / 100,65 * getHeight() / 100);
        house.draw((Graphics2D) g);

        Dog dog = new Dog((Graphics2D) g, 100, 250, getWidth() / 16, 3 * getHeight() / 4);
        dog.draw((Graphics2D) g);
    }
}