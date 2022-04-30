package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class nameGreeting {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String inputName = name.nextLine();

        System.out.println("Hello " + inputName + "!");

    }
}
