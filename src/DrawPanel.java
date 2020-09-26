import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class DrawPanel extends JPanel {
    World world = new World(1, 1);
    Sun sun = new Sun(0.1, 0.1, 0.0833, 0.167, 20, Color.YELLOW);
    Lake lake = new Lake(0.33, 0.8, 0.125, 0.25);
    ArrayList<Tree> trees = RandomTree.Trees(10);
    Fish fish1 = new Fish(0.05, 0.033, 0.4, 0.85, new Color(255, 228, 225));
    Fish fish2 = new Fish(0.067, -0.033,  0.5,0.85, new Color(245, 177, 23));
    House house = new House(0.25,0.25,0.65,0.65);
    Dog dog = new Dog(0.125, 0.125, 0.1, 0.8);

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        g2d.setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);

        world.draw((Graphics2D) g, getHeight(), getWidth());
        sun.draw((Graphics2D) g, getHeight(), getWidth());
        for (Tree t : trees) {
            t.draw((Graphics2D) g, getWidth(), getHeight());
        }
        lake.draw((Graphics2D) g, getHeight(), getWidth());
        fish1.draw((Graphics2D) g, getHeight(), getWidth());
        fish2.draw((Graphics2D) g, getHeight(), getWidth());
        house.draw((Graphics2D) g, getHeight(), getWidth());
        dog.draw((Graphics2D) g, getHeight(), getWidth());
    }
}