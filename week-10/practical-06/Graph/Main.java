/* Note when correcting, I am receiving a warning about safety when compiling
./MyGraph.java:17: warning: [unchecked] unchecked conversion
        this.adjListArray = new LinkedList[nNodes];
                            ^
  required: LinkedList<Node>[]
  found:    LinkedList[]

I try to correct it but I get a generic array creation error
./MyGraph.java:17: error: generic array creation
        this.adjListArray = new LinkedList<Node>[nNodes];

Some reference: https://stackoverflow.com/questions/3865946/error-generic-array-creation */

class Main {

    public static void main(String[] args) {
        
        // Test adjacency matrix
        int[][] adjMatrix = new int[][] {
            new int[] {0, 1, 0, 1},
            new int[] {1, 0, 0, 0},
            new int[] {0, 0, 0, 1},
            new int[] {0, 1, 1, 0},
        };

        // Create the new graph, it work both with the parametrized and basic constructor
        //MyGraph graph = new MyGraph(4);
        MyGraph graph = new MyGraph();

        // It should say empty
        graph.displayAdjListArray();

        // Convert adjacenty matrix to adjacenty list
        graph.matrixToList(adjMatrix);

        // Display the resulting adjacency list
        graph.displayAdjListArray();

    }

}