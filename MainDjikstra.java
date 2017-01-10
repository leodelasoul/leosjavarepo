package javagit;

import java.util.*;
import javagit.*;

public class MainDjikstra {
	
	private static List<Vertex> nodes;
    private static List<Edge> edges;


    
    private static void addLane(String laneId, int sourceLocNo, int destLocNo,int duration) {
    Edge lane = new Edge(laneId,nodes.get(sourceLocNo), nodes.get(destLocNo), duration );
    edges.add(lane);
}

    
	
	public static void main(String args[]){																
		nodes = new ArrayList<Vertex>();
        edges = new ArrayList<Edge>();
        
        
        
        for (int i = 0; i < 5; i++) {														//create vertices within the range of i 
                Vertex location = new Vertex("Node_" + String.valueOf((char)(i + 115)), "Node_" + String.valueOf((char)(i + 115)));
                nodes.add(location);
        }

        addLane("Edge_0", 0, 1, 10);
        addLane("Edge_1", 0, 3, 5);
        addLane("Edge_2", 1, 2, 1);
        addLane("Edge_3", 1, 4, 2);
        addLane("Edge_4", 2, 4, 4);
        addLane("Edge_5", 3, 1, 3);
        addLane("Edge_6", 3, 4, 2);
        addLane("Edge_7", 3, 2, 9);
        addLane("Edge_8", 4, 2, 6);
        addLane("Edge_9", 4, 1, 7);

        
        Graph graph = new Graph(nodes, edges);
        
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm(graph);
        
        dijkstra.execute(nodes.get(2));
        int dist = dijkstra.getShortestDistance(nodes.get(3));
        
        LinkedList<Vertex> path = dijkstra.getPath(nodes.get(4));

        System.out.print(dist + "\n");

        for (Vertex vertex : path) {
                System.out.println(vertex);
        }
		
		
	}
	
}

