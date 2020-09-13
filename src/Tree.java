import java.awt.*;

public class Tree implements Drawable {
    Graphics2D g;
    int numOfTree;
    int width;
    int height;

    public Tree(Graphics2D g, int numOfTree, int width, int height) {
        this.numOfTree = numOfTree;
        this.width = width;
        this.height = height;
    }

    private void drawTree (Graphics2D g, int numOfTree, int width, int height){
        int distanceBetweenTrees = width / numOfTree;
        for (int i = 0; i < numOfTree; i++) {
            int randomWidthOfStump = Generator.rndNumberInRange(width / 90, width /60);
            int randomHighPosOfStump = Generator.rndNumberInRange(height / 2, 65 * height / 100);
            int randomLowPosOfStump = Generator.rndNumberInRange(3 * height / 4, 7 * height / 10);

            int randomLeavesColorR = Generator.rndNumberInRange(0, 205);
            int randomLeavesColorG = 255;
            int randomLeavesColorB = Generator.rndNumberInRange(0, 140);

            int randomStumpColorR = 255;
            int randomStumpColorG = Generator.rndNumberInRange(0, 150);
            int randomStumpColorB = Generator.rndNumberInRange(0, 1);

            g.setColor(new Color(randomStumpColorR, randomStumpColorG, randomStumpColorB));
            g.setStroke(new BasicStroke(randomWidthOfStump));
            g.drawLine(distanceBetweenTrees * i + width / 40, randomHighPosOfStump, distanceBetweenTrees * i + width / 40,  randomLowPosOfStump);

            g.setColor(new Color(randomLeavesColorR, randomLeavesColorG, randomLeavesColorB));
            g.fillOval(distanceBetweenTrees * i + width / 40 - 5 * randomWidthOfStump / 2, randomHighPosOfStump - 7 * randomWidthOfStump / 2, randomWidthOfStump * 5, randomWidthOfStump * 7);
        }
    }

    @Override
    public void draw(Graphics2D g) {
        drawTree(g, numOfTree, width, height);
    }
}