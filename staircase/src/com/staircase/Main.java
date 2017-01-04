package com.staircase;

public class Main {
    // f(n) = f(n-1) + f(n-2)
    // fibonacci method creates a loop
    static int fibonacci(int n, int steps)
    {
        if (n <= 1) // check for the first step
            return n;
        int results = 0; //initialized the results to store the total number of ways
        for (int i = 1; i<=steps && i<=n; i++)
            results += fibonacci(n-i, steps);
        return results;
    }
    //shows the number of ways to get to n'th step
    static int ways(int s, int steps)
    {
        return fibonacci(s+1, steps);
    }
    public static void main (String args[])
    {
        String s = "20";

        int numConvet = Integer.parseInt(s);

        int totalSteps = 20;
        int numSteps = 2;
        System.out.println(ways(totalSteps,numSteps));

        String c = Integer.toString(ways(totalSteps,numSteps));

        System.out.println(c);
    }

}
