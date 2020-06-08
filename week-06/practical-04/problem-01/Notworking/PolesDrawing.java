import javax.swing.*;
import java.awt.*;

class PolesDrawing extends JComponent {

    // First I will initialize the three poles centers
    private int pole1CenterX = 300;
    private int pole2CenterX = 600;
    private int pole3CenterX = 900;

    private int polesCenterY = 100;
    
    private int poleWidth = 20;
    private int poleHeigth = 600;


    public void paint(Graphics g) {

        // Draw the three poles
        g.fillRect(pole1CenterX, polesCenterY, poleWidth, poleHeigth);

        g.fillRect(pole2CenterX, polesCenterY, poleWidth, poleHeigth);

        g.fillRect(pole3CenterX, polesCenterY, poleWidth, poleHeigth);

    }



    // Getters and setters

    public int getPole1CenterX() {
        return this.pole1CenterX;
    }

    public void setPole1CenterX(int pole1CenterX) {
        this.pole1CenterX = pole1CenterX;
    }

    public int getPole2CenterX() {
        return this.pole2CenterX;
    }

    public void setPole2CenterX(int pole2CenterX) {
        this.pole2CenterX = pole2CenterX;
    }

    public int getPole3CenterX() {
        return this.pole3CenterX;
    }

    public void setPole3CenterX(int pole3CenterX) {
        this.pole3CenterX = pole3CenterX;
    }

    public int getPolesCenterY() {
        return this.polesCenterY;
    }

    public void setPolesCenterY(int polesCenterY) {
        this.polesCenterY = polesCenterY;
    }

    public int getPoleWidth() {
        return this.poleWidth;
    }

    public void setPoleWidth(int poleWidth) {
        this.poleWidth = poleWidth;
    }

    public int getPoleHeigth() {
        return this.poleHeigth;
    }

    public void setPoleHeigth(int poleHeigth) {
        this.poleHeigth = poleHeigth;
    }

}