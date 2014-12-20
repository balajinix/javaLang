package hellojava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	private ArrayList<ArrayList<Integer>> adjList;
	private Boolean[] visited;
	private Queue<Integer> queue;
	private int[] path;
	public Graph(int n, int m) {
		queue = new LinkedList<Integer>();
		visited = new Boolean[n];
		path = new int[n];
		for (int i=0;i<n;i++) {
			adjList = new ArrayList<ArrayList<Integer>>();
		}
		// populate adjList somehow
	}
	
	public List<Integer> BFS(Graph g, int s, int key) {
		// return
		List<Integer> route = new ArrayList<Integer>();
		// add start node to queue
		queue.add(s);
		visited[s] = true;
		// continue till queue is not empty
		while (!queue.isEmpty()) {
			int current = queue.poll();
			// iterate over the adjacent nodes of current
			Iterator<Integer> iter = adjList.get(current).iterator();
			while (iter.hasNext()) {
				int node = iter.next();
				if (!visited[node]) {
					queue.add(node);
					visited[current] = true;
					path[node] = current;
					if (node == key) {
						int i = node;
						while (i != s) {
							route.add(i);
							i = path[i];
						}
						route.add(s);
						return route;
					}
				}
			}
		}
		return route;
	}
}
