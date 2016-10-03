package com.Train.route;

public class Main {

    public static void main(String[] args) {
        GraphNode a = new GraphNode(1);
        GraphNode b = new GraphNode(2);
        GraphNode c = new GraphNode(3);
        GraphNode d = new GraphNode(4);
        GraphNode e = new GraphNode(5);


        a.neighbors = new GraphNode[]{b,d,e};
        b.neighbors = new GraphNode[]{a,c,e};
        c.neighbors = new GraphNode[]{b,d,e};
        d.neighbors = new GraphNode[]{a,c,e};
        e.neighbors = new GraphNode[]{a,b,c,d};
    }
}
