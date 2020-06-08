//==================================
// Foundations of Computer Science
// Student: Julian Cabezas Pena
// id: a1785086
// Semester: 1
// Year: 2020
// Practical Number: 4
//===================================


import java.util.Arrays;

public class HanoiTower {

    // Attributes, each pole will be represented with an array, being the numbers inside the disks in order
    private int[] pole1Content;
    private int[] pole2Content;
    private int[] pole3Content;
    // Number of disks in the simulation
    private int nDisks;

    // Basic constructor, using 3 disks
    public HanoiTower() {
        this.nDisks = 3;
        // Create the fist pole filled with the disks (3,2,1) and the other two empty (0,0,0)
        this.pole1Content = filledPole(3);
        this.pole2Content = emptyPole(3);
        this.pole3Content = emptyPole(3);
    }

    // Paremetrized constructor usinga deternmined number of disks
    public HanoiTower(int dTmp) {
        this.nDisks = dTmp;
        // Create the fist pole filled with the disks (n, n-1...3,2,1) and the other two empty (0,0,0... n)
        this.pole1Content = filledPole(dTmp);
        this.pole2Content = emptyPole(dTmp);
        this.pole3Content = emptyPole(dTmp);
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

    // This method moves the disk to the right as explained above
    public void moveDisk (int disk) {

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