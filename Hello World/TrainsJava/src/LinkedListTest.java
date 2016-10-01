import org.junit.Test;

/**
 * Created by Brien on 9/29/2016.
 */
public class LinkedListTest {


    @Test
    public void test() {
        TrainRouteList list = new TrainRouteList();

        //Distances to town
        list.add(new Node(5));//AB5
        list.add(new Node(4));//BC4
        list.add(new Node(8));//CD8
        list.add(new Node(8));//DC8
        list.add(new Node(6));//DE6
        list.add(new Node(5));//AD5
        list.add(new Node(2));//CE2
        list.add(new Node(3));//EB3
        list.add(new Node(7));//AE7

        //Train Routes
        int AB = list.head.data;
        int BC = list.head.next.data;
        int CD = list.head.next.next.data;
        int DC = list.head.next.next.next.data;
        int DE = list.head.next.next.next.next.data;
        int AD = list.head.next.next.next.next.next.data;
        int CE = list.head.next.next.next.next.next.next.data;
        int EB = list.head.next.next.next.next.next.next.next.data;
        int AE = list.head.next.next.next.next.next.next.next.next.data;
        int ED = 0; // No Such Route

        int ABC = AB + BC;
        int ADC = AD + DC;
        int AEBCD = AE + EB + BC + CD;
        int AED = ED + AE;


        System.out.println("Output #1: " + ABC);
        System.out.println("Output #2: " + AD);
        System.out.println("Output #3: " + +ADC);
        System.out.println("Output #4: " + +AEBCD);

        if (AED != 0) {
            System.out.println("Output #5: No such route");
        } else {
            System.out.println("Output #5: " + AED);
        }

        //CDC and CEBC
        int[] routesCtoC;
        routesCtoC = new int[2];
        routesCtoC[0] = CD + DC;
        routesCtoC[1] = CE + EB + BC;
        int size0 = routesCtoC.length;
        System.out.println("Output #6: " + size0);

        //Routes AtoC BCD + DCD + DEB
        int[] routesAtoC;
        routesAtoC = new int[3];
        routesAtoC[0] = AB + BC + CD + DC;
        routesAtoC[1] = AD + DC + CD + DC;
        routesAtoC[2] = AD + DE + EB + BC;
        int size1 = routesAtoC.length;
        System.out.println("Output #7: " + size1);

    }

}

