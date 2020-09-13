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

        Lake lake = new Lake((Graphics2D) g,  getWidth() / 3, 80 * getHeight() / 100, getWidth() / 4, getHeight() /8);
        lake.draw((Graphics2D) g);

        Fish fish1 = new Fish((Graphics2D) g,  getHeight() / 20, getWidth() / 30, 40 * getWidth() / 100, 85 * getHeight() / 100);
        fish1.draw((Graphics2D) g);

        Fish fish2 = new Fish((Graphics2D) g,  getHeight() / 20, getWidth() / 30, 85 * getHeight() / 100, 40 * getWidth() / 100);
        fish2.draw((Graphics2D) g);




        House house = new House((Graphics2D) g,getHeight() / 4,getWidth() / 4,65 * getWidth() / 100,65 * getHeight() / 100);
        house.draw((Graphics2D) g);

        Dog dog = new Dog((Graphics2D) g, getHeight() / 8, getWidth() / 8, getWidth() / 10, 80 * getHeight() / 100);
        dog.draw((Graphics2D) g);
    }
}