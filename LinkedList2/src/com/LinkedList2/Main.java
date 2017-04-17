package com.LinkedList2;

/*
This project I will demonstrate a ListList just for the for of it
 */

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List listMonths = new LinkedList<>();

        listMonths.add("Jan");
        listMonths.add("Feb");
        listMonths.add("mar");
        listMonths.add("Apr");
        listMonths.add("May");
        listMonths.add("Jun");
        listMonths.add("Jul");
        listMonths.add("Aug");
        listMonths.add("Oct");
        listMonths.add("Sep");
        listMonths.add("Nov");
        listMonths.add("Dec");

        System.out.println(listMonths);

        System.out.println(listMonths.get(5));

        listMonths.remove(5);

        System.out.println(listMonths);

        listMonths.add("Jun");

        System.out.println(listMonths);




    }
}
