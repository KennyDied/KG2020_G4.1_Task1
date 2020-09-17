import java.awt.*;

public class House implements Drawable {
    private int height;
    private int width;
    private int x;
    private int y;

    public House(int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawBodyOfHouse(Graphics2D g, int height, int width, int x, int y){
        g.setColor(new Color(238, 130, 98));
        g.fillRect(x, y, width, height);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(width / 80));
        g.drawLine(x + width, y, x + width, y + height);
        g.drawLine(x, y, x, y + height);
        g.drawLine(x, y + height, x + width, y + height);
    }

    private void drawWindow(Graphics2D g, int height, int width, int x, int y){
        g.setColor(new Color(224, 255, 255));
        int windX = x + width / 6;
        int windY = y + height / 6;
        int windHeight = height / 2;
        int windWidth = width / 4;
        g.fillRect(windX, windY, windWidth, windHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(width / 100));

        g.drawLine(windX, windY,windX + windWidth, windY);
        g.drawLine(windX, windY, windX, windY +  height / 2);
        g.drawLine(windX, windY +  height / 2, windX + windWidth, windY +  height / 2);
        g.drawLine(windX + windWidth, windY +  height / 2, windX + windWidth, windY);
        g.drawLine( ((windX + windWidth) + (windX))/2, windY, ((windX + windWidth) + (windX))/2, windY +  height / 2);
        g.drawLine(windX, y + height / 3, windX + windWidth, y + height / 3  );
    }

    private void drawDoor(Graphics2D g, int height, int width, int x, int y){
        g.setColor(new Color(197, 130, 45));
        g.setStroke(new BasicStroke(width / 100));
        int doorX = x + width / 2 + width / 8;
        int doorY = y + height / 3;
        int doorHeight = y + height - doorY;
        int doorWidth = width / 4;
        g.fillRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(width / 120));
        g.drawRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(new Color(238, 220, 130));
        g.fillOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(width / 130));
        g.drawOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
    }

    private void drawChimney(Graphics2D g, int height, int width, int x, int y){
        g.setColor(new Color(205, 85, 85));
        g.fillRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);

        g.setStroke(new BasicStroke(width / 100));
        g.setColor(Color.BLACK);
        g.drawRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);
    }

    private void drawRoof(Graphics2D g, int height, int width, int x, int y){
        g.setColor(new Color(205, 38, 38));
        g.setStroke(new BasicStroke(width / 80));
        int[] roofX = {x + width / 2, x, x + width};
        int[] roofY = {y - height / 4, y, y};
        g.fillPolygon(roofX, roofY, 3);
        g.setColor(Color.BLACK);
        g.drawPolygon(roofX, roofY, 3);
    }

    private void drawAddress(Graphics2D g, int height, int width, int x, int y){

        g.setColor(new Color(98, 157, 217));
        g.fillRect(x + width / 2 + width / 8, y + height / 6, width / 4, height / 8);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(width / 120));
        g.drawRect(x + width / 2 + width / 8, y + height / 6, width / 4, height / 8);

        Font newFont = new Font("Arial", Font.BOLD + Font.PLAIN, width / 30);
        g.setFont(newFont);
        g.drawString("Улица Лесная", x + width / 2 + width / 7, y + height / 4);
    }

    @Override
    public void draw(Graphics2D g) {
        drawBodyOfHouse(g, height,width,x,y);
        drawWindow(g, height,width,x,y);
        drawDoor(g, height,width,x,y);
        drawChimney(g, height, width,x,y);
        drawRoof(g, height, width, x, y);
        drawAddress(g, height, width, x, y);
    }
}