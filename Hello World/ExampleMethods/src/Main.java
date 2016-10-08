import java.util.Scanner;

public class Main {

    static String[] colors = {"Black", "White", "Red", "Blue",
            "Green", "Yellow", "Orange"};

    public static void main(String[] args) {
        System.out.println("Hello World! This example shows how custom methods are used");
        loopDat("Basic colors");
        loopDat("Called method again");

        //Example of method overloading
        String s1 = getInput("Enter value 1: ");
        String s2 = getInput("Enter value 2: ");
        String s3 = getInput("Enter value 3: ");

        double result = addValues(s1, s2);
        System.out.println("The answer is " + result);

        double result2 = addValues(s1, s2, s3);
        System.out.println("The answer is " + result);

    } //Notice... The new custom method is outside of the main method




    //Declares new custom method
    static void loopDat(String label) {

        for (int i = 0; i < label.length(); i++) {
            System.out.print("*");  // <----Not println
        }
        System.out.println("");
        System.out.println(label);
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }
    }

    //Overloaded method
    static String getInput(String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);

        return sc.nextLine();
    }

    static double addValues(String s1, String s2){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double result = d1 + d2;
        return result;
    }
    static double addValues(String s1, String s2, String s3){
        double d1 = Double.parseDouble(s1);
        double d2 = Double.parseDouble(s2);
        double d3 = Double.parseDouble(s3);
        double result = d1 + d2 + d3;
        return result;
    }
}

