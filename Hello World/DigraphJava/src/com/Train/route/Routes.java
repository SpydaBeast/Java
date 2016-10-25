package com.Train.route;

import java.util.ArrayList;
import java.util.Hashtable;

public class Routes {
    public Hashtable<Node, Edge> routeTable;

    public Routes() {
        this.routeTable = new Hashtable<Node, Edge>();
    }

    //calculates distance
    public int distanceBetween(ArrayList<Node> towns) {

        if(towns.size() < 1)
            return 0;
        int distance, depth, i;
        distance = depth = i = 0;

		//Checks for town in hash table
        while(i < towns.size() - 1) {
            if(this.routeTable.containsKey(towns.get(i))) {
                Edge route = this.routeTable.get(towns.get(i));
				// check for route
                while(route != null) {
                    if(route.destination.equals(towns.get(i + 1))) {
                        distance += route.weight;
                        depth++;
                        break;
                    }
                    route = route.next;
                }
            }
            // If no route exist throws exception
            else
                System.out.println("NO SUCH ROUTE");
            i++;
        }
        if(depth != towns.size() - 1)

            System.out.print("NO SUCH ROUTE ");

        return distance;
    }

    //Calculates number of stops
    public int numStops(Node start, Node end, int maxStops) throws Exception{
        return findRoutes(start, end, 0, maxStops);
    }
    private int findRoutes(Node start, Node end, int depth, int maxStops) {
        int routes = 0;
        //Check if start and end nodes exists in route table
        if(this.routeTable.containsKey(start) && this.routeTable.containsKey(end)) {

			 //Traverse all possible routes and for each, checks destination,
             //and number of stops within allowed, and counts possible route.
            depth++;
            if(depth > maxStops)		//Check if within limits
                return 0;
            start.visited = true;		//Mark start node as visited
            Edge edge = this.routeTable.get(start);
            while(edge != null) {

                //Increments routes then continue to next node
                if(edge.destination.equals(end)) {
                    routes++;
                    edge = edge.next;
                    continue;
                }
				// Destination does not match, and
                // node not visited recursively traverse destination node
                else if(!edge.destination.visited) {
                    routes += findRoutes(edge.destination, end, depth, maxStops);
                    depth--;
                }
                edge = edge.next;
            }
        }
        else
            System.out.println("NO SUCH ROUTE");

		//mark the start node as visited before exits
        start.visited = false;
        return routes;
    }

     //Shortest route;
     //Recursive function
    public int shortestRoute(Node start, Node end) throws Exception {
        //Wrapper to maintain weight
        return findShortestRoute(start, end, 0, 0);
    }


    //Shortest route between two nodes
    private int findShortestRoute(Node start, Node end, int weight, int shortestRoute){
        //Checks for start and end nodes
        if(this.routeTable.containsKey(start) && this.routeTable.containsKey(end)) {

			 //Start traverse all possible
			 //routes and checks destination
            start.visited = true;		//Mark start node as visited
            Edge edge = this.routeTable.get(start);
            while(edge != null) {
                //If node not already visited, or is the destination, increment weight
                if(edge.destination == end || !edge.destination.visited)
                    weight += edge.weight;

				//compares route to shortest route
                if(edge.destination.equals(end)) {
                    if(shortestRoute == 0 || weight < shortestRoute)
                        shortestRoute = weight;
                    start.visited = false;
                    return shortestRoute; 			//Unvisited node and return shortest route
                }

                //Destination does not match, and destination node not yet visited, traverse destination node
                else if(!edge.destination.visited) {
                    shortestRoute = findShortestRoute(edge.destination, end, weight, shortestRoute);
                    //Decrement weight as we backtrack
                    weight -= edge.weight;
                }
                edge = edge.next;
            }
        }
        else
            System.out.println("NO SUCH ROUTE");

		//Marks node visited
        start.visited = false;
        return shortestRoute;

    }

    //Shortest route;
    public int numRoutesWithin(Node start, Node end, int maxDistance) throws Exception {
        return findnumRoutesWithin(start, end, 0, maxDistance);
    }

    private int findnumRoutesWithin(Node start, Node end, int weight, int maxDistance){
        int routes = 0;
        //Check if start and end nodes exists
        if(this.routeTable.containsKey(start) && this.routeTable.containsKey(end)) {
            Edge edge = this.routeTable.get(start);
            while(edge != null) {
                weight += edge.weight;
                if(weight <= maxDistance) {
                    if(edge.destination.equals(end)) {
                        routes++;
                        routes += findnumRoutesWithin(edge.destination, end, weight, maxDistance);
                        edge = edge.next;
                        continue;
                    }
                    else {
                        routes += findnumRoutesWithin(edge.destination, end, weight, maxDistance);
                        weight -= edge.weight;	//Decrement weight as we backtrack
                    }
                }
                else
                    weight -= edge.weight;

                edge = edge.next;
            }
        }
        else
            System.out.println("NO SUCH ROUTE");
        return routes;
    }
}