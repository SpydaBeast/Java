package singleton.pattern;

import java.util.ArrayList;

/**
 * 
 * @author Kayla Peacock
 */
public class Singleton {
    ArrayList<String> lanelist = new ArrayList<>();
    private static Singleton Single = new Singleton();
    public static Singleton Singlemeth(){
        
        return Single;
    }
    private Singleton(){
    
    }

}
