public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! This a example of loops.");

        System.out.println("");
        System.out.println("This first loop is called a 'incrementing loop'. ");

        String[] colors = {"Black", "White", "Red", "Blue",
                            "Green", "Yellow", "Orange"};

        //List the colors of the array in order of entry
        System.out.println("===============================");
        System.out.println("            Colors");
        System.out.println("===============================");
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);}
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");
        System.out.println("===============================");
        System.out.println("           Reversed");
        System.out.println("===============================");
        //List the colors of the array in reverse order of entry
        for (int j = colors.length-1; j >=0; j--) {
                System.out.println(colors[j]);
            }
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");

        //List created by a for each loop
        System.out.println("This loop is called a 'for each loop'.");
        System.out.println("===============================");
        for (String color: colors) {
            System.out.println(color);
        }
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");

        //While loops examines a condition and then keeps
        // looping as long as the condition is true
        System.out.println("Next we have a 'while loop' it loops through a list" +
                " as long as the condition is true");
        System.out.println("===============================");
        int counter = 0;
        do{
                System.out.println(colors[counter]);
            counter++;
        }while (counter < colors.length);
        System.out.println("===============================");
        System.out.println("");
        System.out.println("");
    }
}
