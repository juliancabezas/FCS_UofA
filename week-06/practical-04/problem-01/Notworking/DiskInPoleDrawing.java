import javax.swing.*;
import java.awt.*;

class DiskInPoleDrawing extends JPanel {

    private int x;
    private int y;
    private int width;
    private int colorBrightness;
    private int height;


    public DiskInPoleDrawing(int x, int y, int width, int colorBrightness, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.colorBrightness = colorBrightness;
        this.height = height;
    }


    public void draw(Graphics2D g2)
    {
        g2.setColor(new Color(25*colorBrightness,25*colorBrightness,25*colorBrightness));
        Rectangle rectDraw = new Rectangle(x,y,width,height);
        g2.draw(rectDraw);
    }



}