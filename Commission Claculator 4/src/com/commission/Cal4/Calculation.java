package com.commission.Cal4;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by Brien on 10/28/2015.
 */
public class Calculation {
    void calculate(){

        //Fixed Salary
        double Salary = 55000;

        //Sales Commission
        double Commission = .14;
        double Bonus = 1.4;

        //Actual Annual Sales
        double Sales;

        //Total annual compensation
        double Compensation ;

        //UI
        Scanner console = new Scanner(System.in);
        System.out.print("Enter Annual Sales here ----->");
        Sales = console.nextDouble();

        //Calculation
        if (Sales <80000)
        //This is true "Then" Run Following code
        {Commission = Sales * Commission;
            Compensation = Salary + Commission;}
        else
        //Otherwise run this code
        {Bonus = Sales * Bonus;
            Compensation = Sales + Bonus; }

        //Display total annual compensation.
        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Your Total Annual Compensation is $" + df.format(Compensation));

        //Display Table

        //declares array
        String[] anArray;

        //allocates memory
        anArray = new String[12];

        anArray[0] = "Total Sale   Total Compensation";
        anArray[1] = "$100000      $" + df.format((100000*1.4) + 100000);
        anArray[2] = "$105000      $" + df.format((105000*1.4) + 105000);
        anArray[3] = "$110000      $" + df.format((110000*1.4) + 110000);
        anArray[4] = "$115000      $" + df.format((115000*1.4) + 150000);
        anArray[5] = "$120000      $" + df.format((120000*1.4) + 120000);
        anArray[6] = "$125000      $" + df.format((125000*1.4) + 125000);
        anArray[7] = "$130000      $" + df.format((130000*1.4) + 130000);
        anArray[8] = "$135000      $" + df.format((135000*1.4) + 140000);
        anArray[9] = "$140000      $" + df.format((140000*1.4) + 140000);
        anArray[10] ="$145000      $" + df.format((145000*1.4) + 145000);
        anArray[11] ="$150000      $" + df.format((150000*1.4) + 150000);

        for (int i = 0; i < anArray.length; i++) {
            System.out.println(anArray[i]);
        }

    }
}
