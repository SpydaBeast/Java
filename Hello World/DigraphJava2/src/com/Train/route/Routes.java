package com.Train.route;

import java.util.ArrayList;
import java.util.Hashtable;

/**
 * Created by Brien on 10/10/2016.
 */
public class Routes {
    public Hashtable<Node, Edge> routeTable;

    public Routes(){this.routeTable = new Hashtable<Node, Edge>();}

    public int distanceBetween(ArrayList<Node> towns){
       if(towns.size() < 1)
           return 0;
        int distance, depth, i;
        distance = depth = i = 0;

        while(i < towns.size() - 1){
            if (this.routeTable.containsKey(towns.get(i))){
                Edge route = this.routeTable.get(towns.get(i));
                while (route != null) {
                    if (route.destination.equals(towns.get(i + 1))){
                        distance += route.weight;
                        depth++;
                        break;
                    }
                    route = route.next;
                }
            }
            else
                System.out.print("Nope ");
            i++;
        }
        if (depth != towns.size() -1)
            System.out.print("Nope ");
        return distance;
    }
}
