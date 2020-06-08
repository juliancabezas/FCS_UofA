import java.util.*;

class MyGraph {

    // Adjacency array attribute
    LinkedList<Node>[] adjListArray; 

    // Constructor, creates a null linked list array
    public MyGraph() {
        this.adjListArray = null;
    }

    // Constructor, creates a linked list array with n nodes, all empty
    public MyGraph(int nNodes) {

        // Create empty linked list array of nodes of nNodes length
        this.adjListArray = new LinkedList[nNodes];

        // Fill the array with empty linkedlists
        for (int i = 0; i < nNodes; i++){
            this.adjListArray[i] = new LinkedList<Node>();
        }

    }

    public void matrixToList(int[][] matrix){

        // If the linked list is null (basic constructor), create it using the dimension of the adjacency matrix
        if (this.adjListArray == null) {

            // Create empty linked list array of nodes of nNodes length
            this.adjListArray = new LinkedList[matrix.length];

            // Fill the array with empty linkedlists
            for (int i = 0; i < matrix.length; i++){
                this.adjListArray[i] = new LinkedList<Node>();
            }

        }

        
        //For loop though the rows of the matrix
        for (int row = 0; row < matrix.length; row++){

            // I need to create a head for each Linkedlist, with the node according to the row
            this.adjListArray[row].add(new Node(row));

            // For loop though the column values of each row
            for (int col = 0; col < matrix[row].length; col++){

                // Add an element to the linked list if the row-col element in the matrix is 1
                // Also, col has to be different to rol, as it would be the same node
                if ((matrix[row][col] == 1) & (col != row)) {
                    this.adjListArray[row].add(new Node(col));
                }

            }

        }

    }

    // Displays the adjacency matrix
    public void displayAdjListArray(){

        // Check if the adjacency list is empty
        if (this.adjListArray == null) {
            System.out.println("Adjacency list is empty!");

        // 
        } else {
            // Check the lengh of the adjacency list array
            int n = this.adjListArray.length;

            //  traverse though the elements of the array
            for (int i = 0; i < n; i++){
    
                // Traverse the elements of the particular linked list,
                // the size method gives me the length of the linked list
                for (int j = 0; j < this.adjListArray[i].size();j++) {
    
                    if (j == 0) {
                        // print the row (or node) index
                        System.out.print("" + i + ": ");
                    } else {
                        // Print each node included in the particular linked list
                        this.adjListArray[i].get(j).printNode();
                        System.out.print(" -> ");
                    }
                }
    
                System.out.println();
    
            }
        }

    }




}