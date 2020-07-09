package com.harsha.coderbyte;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ShortestPath {
    String ShortestPath(String[] strArr) {
        int nrOfNodes = Integer.parseInt(strArr[0]);
        String[] nodes = new String[nrOfNodes];
        //{"4","X","Y","Z","W","X-Y","Y-Z","X-W"}
        int len = strArr.length;
        String[] connections = new String[len - nrOfNodes - 1];
        for (int i = 1; i < strArr.length; i++) {
            if (i <= nrOfNodes) {
                nodes[i - 1] = strArr[i];
            } else {
                connections[i - nrOfNodes - 1] = strArr[i];
            }

        }
        Field field = build(nodes, connections);
        Node endNode = field.nodes.get(field.nodes.size() - 1);
        weigh(endNode);
        return field.getShortestPath();
    }

    Field build(String[] nodes, String[] connections) {
        Field field = new Field(nodes);
        for (Node node : field.nodes) {
            for (String connection : connections) {
                if (connection.contains(node.name)) {
                    String[] neighbours = connection.split("-");
                    Node neighbour;
                    if (neighbours[0].equals(node.name)) {
                        neighbour = field.findNode(neighbours[1]);
                    } else {
                        neighbour = field.findNode(neighbours[0]);
                    }

                    node.addNeighbour(neighbour);
                }
            }
        }

        return field;
    }

    void weigh(Node node) {
        if (node.end) {
            node.weight = 1;
        }

        for (Node neighbour : node.neighbours) {
            int weight = node.weight + 1;
            if (neighbour.weight == 0 || weight < neighbour.weight) {
                neighbour.weight = node.weight + 1;

                if (!neighbour.start) {
                    weigh(neighbour);
                }
            }
        }
    }

    class Field {
        int nrOfNodes;
        List<Node> nodes;

        Field(String[] nodes) {
            this.nrOfNodes = nodes.length;
            this.nodes = new ArrayList<Node>();

            for (int i = 0; i < nodes.length; i++) {
                this.nodes.add(new Node(nodes[i], i == 0, i == nodes.length - 1));
            }
        }

        Node findNode(String nodeName) {
            for (Node node : this.nodes) {
                if (node.name.equals(nodeName)) {
                    return node;
                }
            }
            return null;
        }

        String getShortestPath() {
            StringBuilder path = new StringBuilder("");
            Node nextNode = this.nodes.get(0);

            if (nextNode.weight == 0) return "-1";

            path.append(nextNode.name).append("-");
            while ((nextNode = nextNode.getNextNeighbour()) != null) {
                path.append(nextNode.name);
                if (!nextNode.end) {
                    path.append("-");
                }
            }
            return path.toString();
        }
    }

    class Node {
        String name;
        boolean start;
        boolean end;
        int weight;
        List<Node> neighbours;

        Node(String name, boolean start, boolean end) {
            this.name = name;
            this.start = start;
            this.end = end;
            this.weight = 0;
            this.neighbours = new ArrayList<Node>();
        }

        void addNeighbour(Node node) {
            this.neighbours.add(node);
        }

        Node getNextNeighbour() {
            if (end) return null;

            for (Node neighbour : this.neighbours) {
                if (neighbour.weight == this.weight - 1) {
                    return neighbour;
                }
            }
            return null;
        }
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        ShortestPath c = new ShortestPath();
//        System.out.print(c.ShortestPath(new String[] {"4","A","B","C","D","A-B","B-D","B-C","C-D"}));
//        System.out.print(c.ShortestPath(new String[] {"5","A","B","C","D","F","A-B","A-C","B-C","C-D","D-F"}));
        System.out.print(c.ShortestPath(new String[] {"4","X","Y","Z","W","X-Y","Y-Z","X-W"}));
    }
}