package com.Train.route;

/**
 * Created by Brien on 10/3/2016.
 */
public class GraphNode {
    public int val;
    public GraphNode next;
    public GraphNode[] neighbors;
    boolean visited;

    GraphNode(int x) {
        val = x;
    }

    public GraphNode(int x, GraphNode[] n){
        val = x;
        neighbors = n;
    }

    public String toString(){
        return "value: "+ this.val;
    }
}
