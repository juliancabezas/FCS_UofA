import javax.swing.*;
import java.awt.*;

public class HanoiTowerGraphicalSolution extends JComponent{

    // Attributes, each pole will be represented with an array, being the numbers inside the disks in order
    private int[] pole1Content;
    private int[] pole2Content;
    private int[] pole3Content;
    // Number of disks in the simulation
    private int nDisks;

    int diskValue;

    PolesDrawing poles = new PolesDrawing();

    DiskPanel diskList;

    Graphics g;

    //private ArrayList<Square> squareList;

    // Basic constructor, using 3 disks
    public HanoiTowerGraphicalSolution() {
        this.nDisks = 3;
        // Create the fist pole filled with the disks (3,2,1) and the other two empty (0,0,0)
        this.pole1Content = filledPole(3);
        this.pole2Content = emptyPole(3);
        this.pole3Content = emptyPole(3);


    }

    // Paremetrized constructor usinga deternmined number of disks
    public HanoiTowerGraphicalSolution(int dTmp) {
        this.nDisks = dTmp;
        // Create the fist pole filled with the disks (n, n-1...3,2,1) and the other two empty (0,0,0... n)
        this.pole1Content = filledPole(dTmp);
        this.pole2Content = emptyPole(dTmp);
        this.pole3Content = emptyPole(dTmp);
    }

    public void solveRecursiveGraphical(int nDisks) {

        // Move disk one to the right, this is the base
        if (nDisks == 1) {
            moveDisk(1,g);




            return;
        } else {
           
            // Solve previous disk and then move the current one, follow by solving previous disk again
            solveRecursiveGraphical(nDisks - 1);

            moveDisk(nDisks,g);

/*             for (int i=0; i < pole1Content.length; i++){ */
/*                diskValue = pole1Content[i];
                System.out.println(diskValue);
                if (diskValue > 0) {
                    //print.g.fillRect(400,400,400,400);
                    diskList.add(new Disk(poles.getPole1CenterX(),i*100,diskValue*10,20,i));
                }

                diskValue = pole2Content[i];
                System.out.println(diskValue);
                if (diskValue > 0) {
                    diskList.add(new Disk(poles.getPole2CenterX(),i*100,diskValue*10,20,i));
                }

                diskValue = pole2Content[i];
                System.out.println(diskValue);
                if (diskValue > 0) {
                    diskList.add(new Disk(poles.getPole3CenterX(),i*100,diskValue*10,20,i));
                }

            } */
            
            solveRecursiveGraphical(nDisks - 1);
         }

    }

    //public void paint(Graphics g) {
    public void paint() {

        //g.fillRect(400, 400, 400, 400);

        //diskPanel.add(new Disk(400,400,400,400));

        solveRecursiveGraphical(nDisks);
        // Draw the three poles
        //g.fillRect(400,400,400,400);
        //repaint();

    }

/*     public void paint(Graphics g) {

        // Draw the three poles
        g.fillRect(pole1CenterX, polesCenterY, poleWidth, poleHeigth);

        g.fillRect(pole2CenterX, polesCenterY, poleWidth, poleHeigth);

        g.fillRect(pole3CenterX, polesCenterY, poleWidth, poleHeigth);

    } */


    //public void add(Disk addDisk) {
     //   Pole1DisksArray.add(addDisk);
     //   repaint();
    //}

    // Methods to solve the arrays

    // This method moves the disk to the right as explained above
    public void moveDisk (int disk, Graphics g) {

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



        //g.fillRect(poles.getPole2CenterX(),i*100,diskValue*10,20,i))

        g.fillRect(400,400,400,400);

        // Optional: print the matrices
        // System.out.println("Pole1: " + Arrays.toString(this.pole1Content));
        // System.out.println("Pole2: " + Arrays.toString(this.pole2Content));
        // System.out.println("Pole3: " + Arrays.toString(this.pole3Content));
        
    }

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



    public int[] getPole1Content() {
        return this.pole1Content;
    }

    public void setPole1Content(int[] pole1Content) {
        this.pole1Content = pole1Content;
    }

    public int[] getPole2Content() {
        return this.pole2Content;
    }







}