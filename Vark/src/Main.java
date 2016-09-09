/*This is an Java exam question
OCA/OCP Java SE 7 Programmer I &II Study Guide

Answer: "rule". The main() method can use var-args,
and a var-args argument is an array (remember, arrays are zero-based).

9/9/2016 Brien:
When I initially wrote this code I was not able to get it to run with out error
This looks like a trick question to me.
*/
class Vark {

            public static void  main(String... a){
                new Vark().go(a,42);
            }
            void go(String [] b, int life){
                System.out.print(b(1));
            }

    /*and he command-line invocation:
    java Vark we rule
    */
}
