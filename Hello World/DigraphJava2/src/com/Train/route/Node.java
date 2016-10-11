package com.Train.route;

/**
 * Created by Brien on 10/10/2016.
 */
public class Node {
    public String town;
    public boolean visited;

    public  Node (String town){
        this.town = town;
        this.visited = false;
    }

    @Override
    public boolean equals(Object b){
        if ( b == null || b.getClass() != getClass()){
          return false;
        }
        Node bx = (Node)b;
        return this.town.equals(bx.town);
    }
    @Override
    public int hashCode(){
        if (this.town == null) return 0;
        return this.town.hashCode();
    }
}
