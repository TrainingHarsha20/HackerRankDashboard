package com.harsha.anyinterview.mathematical.algorithms;

import java.util.LinkedList;

public class Node {
    public int id;
    LinkedList<Node> adjacest = new LinkedList();

    private Node(int id){
        this.id = id;
    }

}
