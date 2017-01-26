public class Main {

    public static void main(String[] args) {
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'e', 't', 'e', 'd' };
        char[] copyTo = new char[7];

        //Using the arraycopy method
        System.arraycopy(copyFrom, 0, copyTo, 0, 5);
        System.out.println(new String(copyTo));


        //Using the copyOfRange method
                char[] copyTo1 = java.util.Arrays.copyOfRange(copyFrom, 2, 10);

                System.out.println(new String(copyTo1));
    }

}
