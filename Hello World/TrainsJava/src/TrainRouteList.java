/**
 * Created by Brien on 9/29/2016.
 */
public class TrainRouteList {
    /****************
     * Functionality
     * Add Node
     * Get data from node
     ****************/

    Node head;
    Node tail;

    public void add(Node node){

        if (tail == null){
            tail = node;
            head = node;
        }else {
            tail.next = node;
            tail = node;
        }

    }
}
