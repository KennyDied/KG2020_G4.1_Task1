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
            int randomWidthOfStump = (int)Math.floor((Math.random() * (25 - 10)) + 10);
            int randomHighPosOfStump = (int)Math.floor((Math.random() * ((height / 2) - 65 * height / 100)) + 65 * height / 100);
            int randomLowPosOfStump = (int)Math.floor((Math.random() * ((3 * height / 4) - 7 * height / 10)) + 7 * height / 10);

            int randomLeavesColorR = (int)(Math.random() * 205);
            int randomLeavesColorG = 255;
            int randomLeavesColorB = (int)(Math.random() * 140);

            int randomStumpColorR = 255;
            int randomStumpColorG = (int)(Math.random() * 150);
            int randomStumpColorB = (int)(Math.random() * 1);

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