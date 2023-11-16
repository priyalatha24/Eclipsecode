package BFS;

import java.util.*;

import DFS.ExampleDFS;


public class BFS_ex {
	private int V;
	private LinkedList<Integer>adj[];
	private Queue<Integer>queue;
	
	BFS_ex(int v){
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;i++) {
			adj[i] = new LinkedList<>();
		}
		queue = new LinkedList<Integer>();
	}
	void addEdge(int v,int w) {
		adj[v].add(w); //adding an edge to adj list(edges are bidirecttional in this example)
	}
	void BFS(int n) {
		boolean nodes[] = new boolean [V]; // initialize boolean array for holding the data 
		int a =0;
		
		nodes[n]=true;
		queue.add(n);  // root node is added to the top of the queue 
		
		while(queue.size()!=0) {
			n=queue.poll();  // remove the top element of the queue 
			System.out.print(n+" "); // print the top element of the queue 
			
			for(int i =0;i<adj[n].size();i++) { //iterate through the linked lis and push all neighbours into queue 
				a = adj[n].get(i);
				if(!nodes[a]) {  // only insert nodes into queue if tthey have not been eploeded already 
					nodes[a]=true;
					queue.add(a);
				}
			}
		}
	}

	public static void main(String[] args) {
		BFS_ex g = new BFS_ex(6);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,0);
		g.addEdge(1,3);
	    //initialize a new  boolean array storeg.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,4);
		g.addEdge(3,5);
		g.addEdge(4,3);
		g.addEdge(5,3);
		
		System.out.println("Following is depth first Traversal: ");
		g.BFS(0);

	}

}
