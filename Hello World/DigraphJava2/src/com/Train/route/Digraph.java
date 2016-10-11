package com.Train.route;

import java.util.ArrayList;

public class Digraph {

    public static void main(String[] args) {
        Routes graph;
        Node a,b,c,d,e;

        graph = new Routes();

        a = new Node("A");
        b = new Node("B");
        c = new Node("C");
        d = new Node("D");
        e = new Node("E");

        //Graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
        graph.routeTable.put(a, new Edge(a, b, 5).next(new Edge(a, d, 5).next(new Edge(a, e, 7))));
        graph.routeTable.put(b, new Edge(b, c, 4));
        graph.routeTable.put(c, new Edge(c, d, 8).next(new Edge(c, e, 2)));
        graph.routeTable.put(d, new Edge(d, c, 8).next(new Edge(d, e, 6)));
        graph.routeTable.put(e, new Edge(e, b, 3));

        ArrayList<Node> route1 = new ArrayList<Node>();
        route1.add(a);
        route1.add(b);
        route1.add(c);
        System.out.print("Output #1: ");
        System.out.println(graph.distanceBetween(route1));

        ArrayList<Node> route5 = new ArrayList<Node>();
        route5.add(a);
        route5.add(e);
        route5.add(d);
        System.out.print("Output #5: ");
        System.out.println(graph.distanceBetween(route5));
    }
}
