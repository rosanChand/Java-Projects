package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class rupeeToUsd {
    public static void main(String[] args) {

        Scanner rupees = new Scanner(System.in);
        System.out.print("Enter total amount of Rupees: ");
        double indianrs = rupees.nextDouble();

        System.out.print("Exchange rate of 1 Indian Rs to USD: ");
        double rate = rupees.nextDouble();
        double converted = indianrs * rate;
        System.out.println(indianrs + " into USD is: " + converted);


    }
}
