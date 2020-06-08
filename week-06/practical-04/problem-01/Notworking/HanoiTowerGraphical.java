import javax.swing.*;
import java.awt.*;

//https://stackoverflow.com/questions/13670787/painting-concentric-shapes-on-a-jpanel-or-jcomponent

//http://users.cis.fiu.edu/~kraynek/COP3337-examples/TowersOfHanoi/TowersOfHanoi.java

public class HanoiTowerGraphical extends JFrame{

    private HanoiTowerGraphicalSolution tower;
    private PolesDrawing poles;

/*     public static void main(String[] args) {

        // Initilizes the graphical frame
        JFrame frame = new JFrame("Hanoi Tower Solution");

        // Allows the software to be closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Defines whith and height of the frame
        frame.setSize(1200,800);

        // Draw the poles
        frame.getContentPane().add(new PolesDrawing()); 

        frame.setVisible(true);

        HanoiTowerGraphicalSolution tower = new HanoiTowerGraphicalSolution(3);

        add(tower, BorderLayout.CENTER);

        tower.solveRecursiveGraphical(3);


    } */

    public HanoiTowerGraphical() {

        super ("Hanoi Tower Graphical");
        

        poles = new PolesDrawing();

        tower = new HanoiTowerGraphicalSolution();
        
        setSize(1200,800);

        //setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //getContentPane().add(new PolesDrawing()); 

        //setLayout(new BorderLayout());

        add(poles);

        add(tower);

        setVisible(true);
    }


/*     public static void main(String[]args)
    {
        new HanoiTowerGraphical();
    }
 */





}