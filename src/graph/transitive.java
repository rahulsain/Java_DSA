// JAVA program to print transitive
// closure of a graph.

import java.util.ArrayList;
import java.util.Arrays;

// A directed graph using
// adjacency list representation
public class Graph {

		// No. of vertices in graph
	private int vertices;

		// adjacency list
	private ArrayList<Integer>[] adjList;

		// To store transitive closure
	private int[][] tc;

	// Constructor
	public Graph(int vertices) {

			// initialise vertex count
			this.vertices = vertices;
			this.tc = new int[this.vertices][this.vertices];

			// initialise adjacency list
			initAdjList();
	}

	// utility method to initialise adjacency list
	@SuppressWarnings("unchecked")
	private void initAdjList() {

		adjList = new ArrayList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjList[i] = new ArrayList<>();
		}
	}

	// add edge from u to v
	public void addEdge(int u, int v) {
				
	// Add v to u's list.
		adjList[u].add(v);
	}

	// The function to find transitive
	// closure. It uses
	// recursive DFSUtil()
	public void transitiveClosure() {

		// Call the recursive helper
		// function to print DFS
		// traversal starting from all
		// vertices one by one
		for (int i = 0; i < vertices; i++) {
			dfsUtil(i, i);
		}

		for (int i = 0; i < vertices; i++) {
		System.out.println(Arrays.toString(tc[i]));
		}
	}

	// A recursive DFS traversal
	// function that finds
	// all reachable vertices for s
	private void dfsUtil(int s, int v) {

		// Mark reachability from
		// s to v as true.
	if(s==v){
		if(adjList[v].contains(v))
		tc[s][v] = 1;
		}
	else
		tc[s][v] = 1;
		
		// Find all the vertices reachable
		// through v
		for (int adj : adjList[v]) {		
			if (tc[s][adj]==0) {
				dfsUtil(s, adj);
			}
		}
	}
	
	// Driver Code
	public static void main(String[] args) {

		// Create a graph given
		// in the above diagram
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		System.out.println("Transitive closure " +
				"matrix is");

		g.transitiveClosure();

	}
}



