package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class takeOperator {
    public static void main (String[] args) {
        Scanner values = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        double a = values.nextDouble();

        System.out.print("Enter a Operator(+, -, *, /): ");
        char o = values.next().charAt(0);

        System.out.print("Enter Second Number: ");
        double b = values.nextDouble();
        //int sum = a + b;

        if (o == '+')
        {
            System.out.println("Addition of " + a + " and " + b + " is: " + (double)(a + b));
        }
        else if (o == '-')
        {
            System.out.println("Substraction of " + a + " and " + b + " is:" + (double)(a-b));
        }
        else if (o == '*')
        {
            System.out.println("Multiplication of " + a + " and " + b + " is:" + (double)(a*b));

        }
        else
        {
            System.out.println("Division of " + a + " and " + b + " is:" + (double)(a/b));

        }

    }
}
