package com.Scoop;

public class Main {

    public static void main(String[] args) {

        class Scoop {
            int thrower() throws Exception{ return  42;}
            public void main(String[] args) {
                int x = 0;
                try {
                    x = thrower();
                } catch (Exception e) {
                    x++;
                        System.out.print("x = " + ++x);

                }
            }

        }
    }
}
