package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int checkNum = number.nextInt();

        if (checkNum % 2 == 0)
        {
            System.out.println(checkNum + " is a Even Number.");
        }
        else
        {
            System.out.println(checkNum +" is a Odd Number.");
        }
    }
}
