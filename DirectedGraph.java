package sortPackage;

import java.util.*;
public class DirectedGraph {
	
	
	private List<Integer> [] adjacencyLists;
	
	public DirectedGraph(int n){
		this.adjacencyLists = new List[n];
		
		for(int i = 0; i < n; i++){
			this.adjacencyLists[i] = new ArrayList<>();
		}
	}
	
	public void addEdge(int from, int to){
		adjacencyLists[from].add(to);		
	}
	
	public void addVertex(int vertex){
		if(!hasVertex(vertex)) adjacencyLists.put(vertex, new adjacencyLists<Integer>());
	}
	
	 public boolean hasVertex(int vertex) {
	        if(adjacencyLists[vertex] != null)
	        	return true;   	
	        
	        else
	        	return false;
	    }
	 
	 //@Override
	 public int size() {
	        return adjacencyLists.length;
	    }

	
	public static void main(){
		DirectedGraph 
	}

}
