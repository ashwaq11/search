package graph;

import java.util.LinkedList;
import java.util.Scanner;

import search.BFSsearch;
import search.DFSsearh;

public class Graph {

	public static void main(String[] args) {
		
		System.out.println("Enter number of vertices");
		Scanner scanner = new Scanner(System.in);
		int vertices = scanner.nextInt();
		System.out.println("Enter number of edges");
		int noEdges = scanner.nextInt();
		Graph graph = new Graph(vertices);
		while (noEdges > 0 ) {
			noEdges--;
			System.out.println( "Enter edge starting vertix ");
			int strartingVertix = scanner.nextInt();
			System.out.println("Enter edge ending vertix");
			int endingVertix = scanner.nextInt();
			graph.addEdge(strartingVertix, endingVertix);	
		}
		
		String choice = null;
		while (StringUtils.) {
			
		}
		BFSsearch.bfsSearch(2, graph);
		
		DFSsearh.dfsSearch(2, graph);

	}
	
	

	private int vertices;   // No. of vertices
    private LinkedList<Integer> adj[]; //Adjacency Lists
 
    // Constructor
    Graph(int v)
    {
        vertices = v;
        adj = new LinkedList[v];																							
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    // Function to add an edge into the graph
    void addEdge(int v,int w)
    {
        adj[v].add(w);
    }
    
    public int getVertices()  {
    	return this.vertices;
    }
    
    public LinkedList<Integer>[] getAdjacencyList() {
    	return this.adj; 
    	
    }

}

