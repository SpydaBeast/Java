
package singleton.pattern;
import java.util.ArrayList;

/**
 * @author Kayla Peacock
 */
public class SingletonPattern {

    public static int num;
    
    public static void main(String[] args) {
        Singleton blue = Singleton.Singlemeth();
        Singleton pink = Singleton.Singlemeth();
        blue.lanelist.add("John Smith"); 
        blue.lanelist.add("Mike Tim"); 
        blue.lanelist.add("Kayla Peacock"); 
        blue.lanelist.add("Anna Ward"); 
        blue.lanelist.add("Tammy Johns"); 
        blue.lanelist.add("Lena Lee"); 
        blue.lanelist.add("Mary James"); 
        blue.lanelist.add("Brooke Binky"); 
        
        for(String runner:pink.lanelist ){
        num++;
        System.out.println("The Lane " + num + " has the runner " + runner);
        }
        
    }
}