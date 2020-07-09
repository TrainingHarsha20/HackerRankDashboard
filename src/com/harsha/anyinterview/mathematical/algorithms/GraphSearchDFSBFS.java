package com.harsha.anyinterview.mathematical.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class GraphSearchDFSBFS {
//    DFS --> Depth First Search
//    BFS --> Breadth First Search

    private HashMap<Integer, Node> nodeLookup = new HashMap<Integer, Node>();

    private Node getNode(int id){
        return nodeLookup.get(id);
    }

    public void addEdge(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        s.adjacest.add(d);
    }

    public boolean hasPathDFS(int source, int destination){
        Node s = getNode(source);
        Node d = getNode(destination);
        HashSet<Integer> visited = new HashSet();
        return hasPathDFS(s,d, visited);
    }

    private boolean hasPathDFS(Node source, Node destination, HashSet<Integer> visited) {
        //if its already visited then return false
        if(visited.contains(source)) return false;

        visited.contains(source.id);
        //if both matches that means we found what we are looking for then retrun true
        if(source == destination) return true;

        for(Node child: source.adjacest){
            if(hasPathDFS(child, destination,visited)){
                return true;
            }
        }
        return false;
    }

    public boolean hasPathBFS(Node source, Node destination){
        LinkedList<Node> nextToVisit = new LinkedList<Node>();
        HashSet<Integer> visited = new HashSet();
        nextToVisit.add(source);
        while(!nextToVisit.isEmpty()){
            Node node = nextToVisit.remove();
            if(node == destination) return true;
            if(visited.contains(node.id)) continue;
            visited.add(node.id);
            for(Node child : node.adjacest){
                nextToVisit.add(child);
            }
        }
        return false;
    }

}
