package com.juliuskrah.ds;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	private static final Logger log = System.getLogger(Graph.class.getName());
	private final int numOfVertices;
	private List<Integer>[] adjacencyList;

	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		int startAt = 2;
		log.log(Level.INFO, "Following is Breadth First Traversal (starting from vertex {0})", startAt);

		g.bfs(startAt);

		log.log(Level.INFO, "Following is Depth First Traversal");

		g.dfs();
	}

	@SuppressWarnings("unchecked")
	public Graph(int vertices) {
		this.numOfVertices = vertices;
		adjacencyList = new LinkedList[numOfVertices];
		for (int i = 0; i < numOfVertices; i++)
			adjacencyList[i] = new LinkedList<>();
	}

	void addEdge(int v, int w) {
		adjacencyList[v].add(w);
	}

	/**
	 * @implNote time complexity O(V+E)
	 * @param startingAt starting vertex
	 */
	public void bfs(int startingAt) {
		boolean[] visited = new boolean[numOfVertices];

		Queue<Integer> queue = new LinkedList<>();
		visited[startingAt] = true;
		queue.add(startingAt);
		while (!queue.isEmpty()) {
			startingAt = queue.poll();
			log.log(Level.INFO, startingAt);
			var iterator = adjacencyList[startingAt].listIterator();
			while (iterator.hasNext()) {
				int vertex = iterator.next();
				if (!visited[vertex]) {
					visited[vertex] = true;
					queue.add(vertex);
				}
			}
		}
	}

	/**
	 * @implNote time complexity O(V + E) <br/>
	 *           space complexity O(V)
	 */
	public void dfs() {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[numOfVertices];

		// Call the recursive helper function to print DFS traversal
		// starting from all vertices one by one
		for (int i = 0; i < numOfVertices; ++i)
			if (visited[i] == false)
				dfsUtil(i, visited);
	}

	private void dfsUtil(int vertex, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[vertex] = true;
		log.log(Level.INFO, vertex);

		// Recur for all the vertices adjacent to this vertex
		var iterator = adjacencyList[vertex].listIterator();
		while (iterator.hasNext()) {
			int n = iterator.next();
			if (!visited[n])
				dfsUtil(n, visited);
		}
	}
}
