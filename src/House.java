import java.awt.*;

public class House implements Drawable {
    Graphics2D g;
    int height;
    int width;
    int x;
    int y;


    public House(Graphics2D g, int height, int width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    private void drawBodyOfHouse(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.DARK_GRAY);
        g.fillRect(x, y, width, height);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5.0f));
        g.drawLine(x + width, y, x + width, y + height);
        g.drawLine(x, y, x, y + height);
        g.drawLine(x, y + height, x + width, y + height);
    }

    private void drawWindow(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.CYAN);
        int windX = x + width / 6;
        int windY = y + height / 6;
        int windHeight = height / 2;
        int windWidth = width / 4;
        g.fillRect(windX, windY, windWidth, windHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(5.0f));

        g.drawLine(windX, windY,windX + windWidth, windY);
        g.drawLine(windX, windY, windX, windY +  height / 2);
        g.drawLine(windX, windY +  height / 2, windX + windWidth, windY +  height / 2);
        g.drawLine(windX + windWidth, windY +  height / 2, windX + windWidth, windY);
        g.drawLine( ((windX + windWidth) + (windX))/2, windY, ((windX + windWidth) + (windX))/2, windY +  height / 2);
        g.drawLine(windX, y + height / 3, windX + windWidth, y + height / 3  );
    }

    private void drawDoor(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.PINK);
        g.setStroke(new BasicStroke(5.0f));
        int doorX = x + width / 2 + width / 8;
        int doorY = y + height / 3;
        int doorHeight = y + height - doorY;
        int doorWidth = width / 4;
        g.fillRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(4.0f));
        g.drawRect(doorX, doorY, doorWidth, doorHeight);

        g.setColor(Color.MAGENTA);
        g.fillOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
        g.setColor(Color.BLACK);
        g.setStroke(new BasicStroke(2.0f));
        g.drawOval(doorX + doorWidth / 8, doorY + doorHeight / 2, doorWidth / 8,doorWidth / 8);
    }

    private void drawChimney(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.ORANGE);
        g.fillRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);

        g.setStroke(new BasicStroke(3.0f));
        g.setColor(Color.BLACK);
        g.drawRect(x + 3 * width / 4, y - height / 4, width / 6, height / 4);
    }

    private void drawRoof(Graphics2D g, int height, int width, int x, int y){
        g.setColor(Color.PINK);
        g.setStroke(new BasicStroke(5.0f));
        int ax = x + width / 2;
        int bx = x;
        int cx = x + width;
        int ay = y - height / 4;
        int by = y;
        int cy = y;
        int[] roofX = {x + width / 2, x, x + width};
        int[] roofY = {y - height / 4, y, y};
        g.fillPolygon(roofX, roofY, 3);
        g.setColor(Color.BLACK);

        g.drawPolygon(roofX, roofY, 3);
    }

    private void drawAdress(Graphics2D g, int height, int width, int x, int y){

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(x + width / 2 + width / 8, y + height / 6, width / 4, height / 8);

        g.setColor(Color.black);
        g.setStroke(new BasicStroke(1.0f));
        g.drawRect(x + width / 2 + width / 8, y + height / 6, width / 4, height / 8);

//        int adressRectCenterX = width / 8;
//        int adressRectCenterY = height / 16;
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
        drawAdress(g, height, width, x, y);
    }
}