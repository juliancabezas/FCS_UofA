class Graph {
	public int v; // number of vertices
	public int[][] adjMatrix;
	public LinkedList[] adjList;

	public Graph(int v) {
		this.v = v;

		// Create adjMatrix
		this.adjMatrix = new int[v][v];

		// Create adjList
		this.adjList = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			this.adjList[i] = new LinkedList();
		}
	}

	// Add edge in udirected graph
	public void addEdge(int v1, int v2) {
		// Add edge in matrix
		this.adjMatrix[v1][v2] = 1;
		this.adjMatrix[v2][v1] = 1;

		// Add edge in list
		this.adjList[v1].add(v2);
		this.adjList[v2].add(v1);
	}

	// Print graph as a list
	public void printList() {
		for (int i = 0; i < this.v; i++) {
			System.out.print(i + ": ");
			this.adjList[i].print();
		}
	}

	// Print graph as a matrix
	public void printMatrix() {
		System.out.print("     ");
		for (int i = 0; i < this.v; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 0; i < this.v; i++) {
			System.out.print(i + " |  ");
			for (int j = 0; j < this.v; j++) {
				System.out.print(this.adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
}