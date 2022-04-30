package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class Fibonacciseries {

    public static void main (String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the numner till Fibonacci series is required: ");
        int n = num.nextInt();

        int count = 1;
        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 +" "+ n2);
        int n3 =0;
        do
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            count++;
            System.out.println();
        }
        while (count < n);
        System.out.println(n3);
    }
}
