package com.Train.route;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Digraph {

    public static void main(String[] args) throws Exception {
        Routes graph;
        Node a,b,c,d,e;

        graph = new Routes();

        a = new Node("A");
        b = new Node("B");
        c = new Node("C");
        d = new Node("D");
        e = new Node("E");

        //reads data from text file
        BufferedReader input = new BufferedReader(new FileReader("input.txt"));

        /*
        To change distance of routes change text file (input.txt) line with
        corresponding route
         */

        //Iterates the input.txt, and finds specific line
        String entryOne = "";
        for (int i = 0; i < 1; i++){
            entryOne = input.readLine();
        }
        int ab = Integer.parseInt(entryOne);

        String entryTwo = "";
        for (int i = 1; i < 2; i++){
            entryTwo = input.readLine();
        }
        int ad = Integer.parseInt(entryTwo);

        String entryThree = "";
        for (int i = 2; i < 3; i++){
            entryThree = input.readLine();
        }
        int ae = Integer.parseInt(entryThree);

        String entryFour = "";
        for (int i = 3; i < 4; i++){
            entryFour = input.readLine();
        }
        int bc = Integer.parseInt(entryFour);

        String entryFive = "";
        for (int i = 4; i < 5; i++){
            entryFive = input.readLine();
        }
        int cd = Integer.parseInt(entryFive);

        String entrySix = "";
        for (int i = 5; i < 6; i++){
            entrySix = input.readLine();
        }
        int ce = Integer.parseInt(entrySix);

        String entrySeven = "";
        for (int i = 6; i < 7; i++){
            entrySeven = input.readLine();
        }
        int dc = Integer.parseInt(entrySeven);

        String entryEight = "";
        for (int i = 7; i < 8; i++){
            entryEight = input.readLine();
        }
        int de = Integer.parseInt(entryEight);

        String entryNine = "";
        for (int i = 8; i < 9; i++){
            entryNine = input.readLine();
        }
        int eb = Integer.parseInt(entryNine);

        //Graph: AB5, BC4, CD8, DC8, DE6, AD5, CE2, EB3, AE7
        graph.routeTable.put(a, new Edge(a, b, ab).next(new Edge(a, d, ad).next(new Edge(a, e, ae))));
        graph.routeTable.put(b, new Edge(b, c, bc));
        graph.routeTable.put(c, new Edge(c, d, cd).next(new Edge(c, e, ce)));
        graph.routeTable.put(d, new Edge(d, c, dc).next(new Edge(d, e, de)));
        graph.routeTable.put(e, new Edge(e, b, eb));
        input.close();

        //Output List
        ArrayList<Node> route1 = new ArrayList<Node>();
        route1.add(a);
        route1.add(b);
        route1.add(c);
        System.out.print("Output #1: ");
        System.out.println(graph.distanceBetween(route1));

        ArrayList<Node> route2 = new ArrayList<Node>();
        route2.add(a);
        route2.add(d);
        System.out.print("Output #2: ");
        System.out.println(graph.distanceBetween(route2));

        ArrayList<Node> route3 = new ArrayList<Node>();
        route3.add(a);
        route3.add(d);
        route3.add(c);
        System.out.print("Output #3: ");
        System.out.println(graph.distanceBetween(route3));

        ArrayList<Node> route4 = new ArrayList<Node>();
        route4.add(a);
        route4.add(e);
        route4.add(b);
        route4.add(c);
        route4.add(d);
        System.out.print("Output #4: ");
        System.out.println(graph.distanceBetween(route4));

        ArrayList<Node> route5 = new ArrayList<Node>();
        route5.add(a);
        route5.add(e);
        route5.add(d);
        System.out.print("Output #5: ");
        System.out.println(graph.distanceBetween(route5));

        int numStops1 = graph.numStops(c, c, 3);
        System.out.print("Output #6: ");
        System.out.println(numStops1);

        int numStops2 = graph.numStops(a, c, 4);
        System.out.print("Output #7: ");
        System.out.println(numStops2);

        int shortestRoute1 = graph.shortestRoute(a, c);
        System.out.print("Output #8: ");
        System.out.println(shortestRoute1);

        int shortestRoute2 = graph.shortestRoute(b, b);
        System.out.print("Output #9: ");
        System.out.println(shortestRoute2);

        int numRoutesWithin = graph.numRoutesWithin(c, c, 30);
        System.out.print("Output #10: ");
        System.out.println(numRoutesWithin);
        System.out.println("==============");
    }
}
