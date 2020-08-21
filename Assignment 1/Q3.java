//4. To find the shortest path beetween 2 nodes and check if a negative cycle exists.

import java.util.*;

public class Q3 
{	
	static class Edge 
	{
		int src, dest, cost;

		Edge(int s, int d, int c) 
		{
			src = s;
			dest = d;
			cost = c;
		}
	}

	
	public static String bellmanFord(ArrayList<Edge> edges, int n, int src, int dest) 
	{
		int m = edges.size();
		int dist[] = new int[n];
		
		Arrays.fill(dist, Integer.MAX_VALUE);
		
		dist[src] = 0;
		
		for (int i = 1; i < n; i++) 
			for (Edge edge : edges) 
			{
				int u = edge.src;
				int v = edge.dest;
				int w = edge.cost;
				
				if (dist[u] != Integer.MAX_VALUE && dist[v] > dist[u] + w) 
					dist[v] = dist[u] + w;
			}
			
		
		for (Edge edge : edges) 
		{
			int u = edge.src;
			int v = edge.dest;
			int w = edge.cost;
			
			if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) 
				return "Negative Cycle Exists";
			
		}
		
		return dist[dest] == Integer.MAX_VALUE ? "No path" : String.valueOf(dist[dest]);
	}

	
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\nEnter no. of vertices in graph: ");
		int n = sc.nextInt();
		
		System.out.println("\nEnter no. of edges in graph: ");
		int m = sc.nextInt();
		
		ArrayList<Edge> edges = new ArrayList<Edge>(m);
		
		System.out.println("\nEnter the Source, Destination and Cost of the edges: ");
		
		
		for (int i = 0; i < m; i++) 
			edges.add(new Edge(sc.nextInt(), sc.nextInt(), sc.nextInt()));
		
		
		System.out.println("\nEnter source vertex:");
		int src = sc.nextInt();
		
		System.out.println("\nEnter destination vertex:");
		int dest = sc.nextInt();
		
		System.out.println("\n" + bellmanFord(edges, n, src, dest));
	}

}