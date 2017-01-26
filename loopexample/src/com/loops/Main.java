package com.loops;

import java.io.*;



public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader("input"));
        //BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while ((s = in.readLine()) != null) {

            int parenOpen = 0;
            int parenClose = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '('){
                    parenOpen++;
                    if (i == 0 || s.charAt(i-1) != ':'){
                        parenClose++;
                    }
                }
                if (s.charAt(i) == ')'){
                    parenClose = Math.max(0, parenClose-1);
                    if (i == 0 || s.charAt(i-1) != ':'){
                        parenOpen--;
                    }
                }
            }
            if (parenOpen >= 0 && parenClose == 0) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }
}


