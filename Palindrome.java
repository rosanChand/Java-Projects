package com.ProjectFirstJavaProgram;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner word = new Scanner(System.in);

        System.out.print("Enter a String: ");

        String check= word.nextLine();
        //String check1 = check.toUpperCase();
        int i = 0;
        int len = check.length() - 1;
        char[] reverseFinal = new char[len+1];
        while (i <= len) {
            //reverseFinal = new char[len + 1];
            char opposite = check.charAt(len - i);
            reverseFinal[i] = check.charAt(len - i);
            //System.out.print(opposite);
            i++;


        }
        //System.out.println();
        //System.out.println(reverseFinal);
        String oppo2 =new String(reverseFinal);
        //System.out.println(oppo2);
        if (check.equalsIgnoreCase(oppo2))
        {
            System.out.println(check + " is a Plaindrome cause " + check + " = " + oppo2);
        }
        else
        {
            System.out.println(check + " is NOT a Plaindrome cause " + check + " is not eqauls to " + oppo2);
        }
    }
}
