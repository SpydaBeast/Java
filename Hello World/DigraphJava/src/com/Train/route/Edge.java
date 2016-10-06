package com.Train.route;

public class Edge {
    //Origin town
    public Node origin;
    //Destination town
    public Node destination;
    //Route destination
    public int weight;
    //next possible route
    public Edge next;
    //constructor
    public Edge(Node origin, Node destination, int weight) {
        this.origin 		= origin;
        this.destination	= destination;
        this.weight 		= weight;
        this.next 		= null;
    }

    public Edge next(Edge edge) {
        this.next = edge;
        return this;
    }
}