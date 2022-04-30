package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        System.out.print("Enter first Number: ");
        double a = num.nextDouble();

        System.out.print("Enter Second Number: ");
        double b = num.nextDouble();

        if (a > b)
        {
            System.out.println("The Largest Number is: " + a);
        }
        else if (a < b)
        {
            System.out.println("The Largest Number is: " + b);
        }
        else
        {
            System.out.println("Both are equal.");
        }

    }
}
