package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner values = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        int p = values.nextInt();

        System.out.print("Enter time in Year : ");
        double t = values.nextDouble();

        System.out.print("Enter rate: ");
        int r = values.nextInt();

        double I = p + (p * t * r) / 100;
        System.out.println("Simple Interest is: " + I);
    }
}
