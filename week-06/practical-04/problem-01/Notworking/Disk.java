import javax.swing.*;
import java.awt.*;

class Disk extends JComponent {

    private int x;
    private int y;
    private int width;
    private int colorBrightness;
    private int height;



    private Color theColor;

    public Disk(int xS, int yS, int widthS, int heightS)
    {
        x = xS;
        y = yS;
        width = widthS;
        height = heightS;

    }

    public Disk(int x, int y, int width, int height,int colorBrightness)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.colorBrightness = colorBrightness;
        this.height = height;
    }

    
    public void paint(Graphics g2)
    {
        //2.setColor(new Color(25*colorBrightness,25*colorBrightness,25*colorBrightness));
        g2.setColor(Color.BLUE);
        //Rectangle rectDraw = new Rectangle(x,y,width,height);

        g2.fillRect(x, y, width, height);

        //g2.draw(rectDraw);
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getColorBrightness() {
        return this.colorBrightness;
    }

    public void setColorBrightness(int colorBrightness) {
        this.colorBrightness = colorBrightness;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Color getTheColor() {
        return this.theColor;
    }

    public void setTheColor(Color theColor) {
        this.theColor = theColor;
    }


}