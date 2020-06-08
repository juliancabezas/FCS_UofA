//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================

import java.awt.*;
import javax.swing.*;

public class HanoiTowerGUI extends JFrame {

    // Attributes, each pole will be represented with an array, being the numbers inside the disks in order
    private int[] pole1Content;
    private int[] pole2Content;
    private int[] pole3Content;
    // Number of disks in the simulation
    private int nDisks;

    // Graphical Components
    public Graphics g;

    // Graphical Attributes of the poles and disks
    private int pole1CenterX = 300;
    private int pole2CenterX = 600;
    private int pole3CenterX = 900;
    private int polesCenterY = 100;
    private int poleWidth = 20;
    private int poleHeigth = 600;
    private int diskHeight;
    private int diskValue;

    // Basic constructor, using 3 disks
    public HanoiTowerGUI() {

        this.nDisks = 3;
        // Create the fist pole filled with the disks (3,2,1) and the other two empty (0,0,0)
        this.pole1Content = filledPole(3);
        this.pole2Content = emptyPole(3);
        this.pole3Content = emptyPole(3);

        // Disk height according to the number of disks
        this.diskHeight = poleHeigth/nDisks;

        // Title of the frame
        setTitle("Hanoi Tower Graphical Solution");

		//This allows us to close the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		// Frame Size
        setSize(1200,800);
        
        // This is necesarry to set the fram to visible
		setVisible(true);

        // Set the graphics
        g = getGraphics();
        
		// Paint the poles and the disks
		this.paint(g);


    }

    // Paremetrized constructor usinga deternmined number of disks
    public HanoiTowerGUI(int dTmp) {
        this.nDisks = dTmp;
        // Create the fist pole filled with the disks (n, n-1...3,2,1) and the other two empty (0,0,0... n)
        this.pole1Content = filledPole(dTmp);
        this.pole2Content = emptyPole(dTmp);
        this.pole3Content = emptyPole(dTmp);

        // Disk height according to the number of disks
        this.diskHeight = poleHeigth/nDisks;

        // Title of the frame
        setTitle("Hanoi Tower Graphical Solution");

		//This allows us to close the window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
		// Frame Size
        setSize(1200,800);
        
        // This is necesarry to set the fram to visible
		setVisible(true);

        // Set the graphics
        g = getGraphics();
        
		// Paint the poles and the disks
		this.paint(g);
    }

    // Methods

    // Solve method using the recursive method
    public void solve() {
        solveRecursive(this.nDisks);
    }

    // This method is designed to move the disk always to the right if possible
    // (e.g. if the disk is in in pole 1 move to pole 2, if in pole 3 move it to pole 1)
    public void solveRecursive(int nDisks) {

        // Move disk one to the right, this is the base
        if (nDisks == 1) {
            moveDisk(1);
            return;
        } else {
           
            // Solve previous disk and then move the current one, follow by solving previous disk again
            solveRecursive(nDisks - 1);
            moveDisk(nDisks);
            solveRecursive(nDisks - 1);
        }

    }

    // This method moves the disk between arrays

    public void moveDisk (int disk) {

        // This is for causing an small delay (1.5 seg) between movements
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
        } 

        // Initialize variables
        int diskLocation = 0;
        int diskDestination = 0;

        // First find where the disk is and store its location in the disklocation destination
        // Then replace the disk in the array with a cero (empty)
        if (findDisk(this.pole1Content, disk)) {
            diskLocation = 1;
            this.pole1Content = findAndReplace(this.pole1Content, disk, 0);
            
        } else if (findDisk(this.pole2Content, disk)) {
            diskLocation = 2;
            this.pole2Content = findAndReplace(this.pole2Content, disk, 0);
            
        } else if (findDisk(this.pole3Content, disk)) {
            diskLocation = 3;
            this.pole3Content = findAndReplace(this.pole3Content, disk, 0) ;
            
        } else {
            System.out.println("Cant find the disk!");
        }

        // Using the disklocation move the disk to the right pole
        // (e.g. if the disk is in in pole 1 move to pole 2, if in pole 3 move it to pole 1)
        switch(diskLocation) {

            case 1:
                // Move the disk to the right 
                if (canPlaceDisk(disk, this.pole2Content)) {
                    this.pole2Content = findAndReplace(this.pole2Content, 0, disk);
                    diskDestination = 2;
                // If it is not possible to move it to the right skip it and move it to the other pole
                } else {
                    this.pole3Content = findAndReplace(this.pole3Content, 0, disk);
                    diskDestination = 3;
                }
                break;

            case 2:
                if (canPlaceDisk(disk, this.pole3Content)) {
                    this.pole3Content = findAndReplace(this.pole3Content, 0, disk);
                    diskDestination = 3;
                } else {
                    this.pole1Content = findAndReplace(this.pole1Content, 0, disk);
                    diskDestination = 1;
                }
                break;

            case 3:
                if (canPlaceDisk(disk, this.pole1Content)) {
                    this.pole1Content = findAndReplace(this.pole1Content, 0, disk);
                    diskDestination = 1;
                } else {
                    this.pole2Content = findAndReplace(this.pole2Content, 0, disk);
                    diskDestination = 2;
                }
                break;
            default:
                System.out.println("Can fint a suitable destination for the disk");
                break;
        }
        
        // Print the result in the console
        System.out.println("Move the disk " + disk + " from Pole" + diskLocation + " to Pole" + diskDestination);

        // Print a White rectangle to reprint all over again
        g.setColor(new Color(255,255,255));                
        g.fillRect(0,0,1200,800);
        
        // Revalidate and reprint to use the print method to display everything updated
        revalidate();
        repaint();

    }


    //Method to paint the poles and disks
    @Override
	public void paint(Graphics g){

		// Draw the poles in gray
        g.setColor(Color.GRAY);
        g.fillRect(pole1CenterX, polesCenterY, poleWidth, poleHeigth);
        g.fillRect(pole2CenterX, polesCenterY, poleWidth, poleHeigth);
        g.fillRect(pole3CenterX, polesCenterY, poleWidth, poleHeigth);
        

        // Extract the values from the pole 1 array and print them as rectangles
        for (int i=0; i < pole1Content.length; i++){ 

            diskValue = pole1Content[i];

            if (diskValue > 0) {
                // Set a color according to the diskvalie
                g.setColor(new Color(diskValue * (100/nDisks),diskValue * (140/nDisks),diskValue * (200/nDisks)));

                // Fill the rectangle with the disk, it uses the graphical parameters to place the disk and give it shape
                g.fillRect(pole1CenterX-(diskValue*(140/nDisks))+(poleWidth/2),(polesCenterY+poleHeigth)-(diskHeight*(i+1)),diskValue*(280/nDisks), diskHeight);


            }
        }

        // Extract the values from the pole 2 array and print them as rectangles
        for (int i=0; i < pole2Content.length; i++){ 

            diskValue = pole2Content[i];
            
            if (diskValue > 0) {
                
                g.setColor(new Color(diskValue * (100/nDisks),diskValue * (140/nDisks),diskValue * (200/nDisks)));
                g.fillRect(pole2CenterX-(diskValue*(140/nDisks))+(poleWidth/2),(polesCenterY+poleHeigth)-(diskHeight*(i+1)),diskValue*(280/nDisks), diskHeight);

            }
        }

        // Extract the values from the pole 3 array and print them as rectangles
        for (int i=0; i < pole3Content.length; i++){ 

            diskValue = pole3Content[i];

            if (diskValue > 0) {

                g.setColor(new Color(diskValue * (100/nDisks),diskValue * (140/nDisks),diskValue * (200/nDisks)));
                g.fillRect(pole3CenterX-(diskValue*(140/nDisks))+(poleWidth/2),(polesCenterY+poleHeigth)-(diskHeight*(i+1)),diskValue*(280/nDisks), diskHeight);

            }
        }
    }
    

    // Helper methods to solve the Hanoi tower, used in MoveDisk() Method

    // Function to find an element of the array and replace it
    public int [] findAndReplace(int[] pole, int find, int replace) {

        // Loop throgh the array
        for (int i=0; i < pole.length; i++) {

            // If it finds the element it replaces it and moves along
            if (pole[i] == find) {
                pole[i] = replace;
                break;
            }
        }

        return pole;

    }

    // Function to find the disk in an specific pole
    public boolean findDisk(int[] pole, int find) {

        // Default is false
        boolean isHere = false;

        for (int i=0; i < pole.length; i++) {
            
            // If it finds it return tru
            if (pole[i] == find) {
                isHere = true;
            }
        }

        return isHere;

    }

    // Funcion to determine if the disk can be placed in the pole according to the TOH rules
    public boolean canPlaceDisk(int disk, int[] pole) {

        boolean canPlace = false;

        for (int i=0; i < pole.length; i++) {

            // If it is the first element of the matrix check if the pole is empty
            if (i == 0) {
                if (pole[i] == 0) {
                    canPlace = true;
                }
            // Check if the element is empty and if the previous disk is bigger than the current one
            } else {
                if ((pole[i] == 0) && (pole[i-1] > disk && pole[i-1] != 0)) {
                    canPlace = true;
                }
            }

        }

        return canPlace;

    }


    // Make a sequence of numbers inside of an array
    // Takes dim as in input
    public int [] filledPole(int dim) {

        int seq = dim;
        int[] pole = new int[dim];

        for (int i=0; i < dim; i++) {
            // Input the element in the first element of the array and then move along the sequence
            pole[i] = seq;
            seq = seq - 1; 

        }
        return pole;
    }

    public int [] emptyPole(int dim) {

        int[] seqArray = new int[dim];

        for (int i=0; i < dim; i++) {
            // Fill everything with zeroes
            seqArray[i] = 0;
        }
        return seqArray;
    }

    // Iterative method, currently only working with disk = 3 or disks = 2
    public void solveIteratuve(int nDisks) {

        // Make a loop from the number of disks going to zero
        for (int i = nDisks; i > 0; i--) {

            // Solve the previuos disk
            for (int j = 1; j <  nDisks; j++) {

                moveDisk(j);

                // if the disk is not 1 move the previous one
                if (j!=1) {
                moveDisk(j-1);
                }

            }

            // Solve the current disk
            moveDisk(nDisks);
            nDisks = nDisks -1;

        }

    }


    // Mutators and accessors

    public int[] getPole1Content() {
        return this.pole1Content;
    }

    public void setPole1Content(int[] pole1Content) {
        this.pole1Content = pole1Content;
    }

    public int[] getPole2Content() {
        return this.pole2Content;
    }

    public void setPole2Content(int[] pole2Content) {
        this.pole2Content = pole2Content;
    }

    public int[] getPole3Content() {
        return this.pole3Content;
    }

    public void setPole3Content(int[] pole3Content) {
        this.pole3Content = pole3Content;
    }

}