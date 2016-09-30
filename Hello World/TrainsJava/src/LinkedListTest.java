import org.junit.Test;

/**
 * Created by Brien on 9/29/2016.
 */
public class LinkedListTest {
    @Test
    public void test (){
       TrainRouteList list = new TrainRouteList();

        list.add(new Node(new int[5], new String("AB")));//AB5
        list.add(new Node(new int[4], new String("BC")));//BC4
        list.add(new Node(new int[8], new String("CD")));//CD8
        list.add(new Node(new int[8], new String("DC")));//DC8
        list.add(new Node(new int[6], new String("DE")));//DE6
        list.add(new Node(new int[5], new String("AD")));//AD5
        list.add(new Node(new int[2], new String("CE")));//CE2
        list.add(new Node(new int[3], new String("EB")));//EB3
        list.add(new Node(new int[7], new String("AE")));//AE7


    }
}

