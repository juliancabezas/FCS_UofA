import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DiskPanel extends JComponent{

    private ArrayList<Disk> diskList;

    public DiskPanel()
    {
        //setBackground(Color.WHITE);
        diskList = new ArrayList<Disk>();

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g.create();

        for (int i = 0; i < diskList.size(); i++)
        {
            Disk tempDisk = diskList.get(i);

            g2.fillRect(tempDisk.getX(), tempDisk.getY(), tempDisk.getWidth(), tempDisk.getHeight());

            //tempDisk.paint(g2);
        }

    } 

     public void add(Disk addDisk) {
        diskList.add(addDisk);
        repaint();
    } 

}