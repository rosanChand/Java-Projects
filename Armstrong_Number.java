package com.ProjectFirstJavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = num.nextInt();
        int num3 = number;
        int num5 = number;

        int len = 0;

        //int j = 0;
        while (number != 0)
        {
            number = number / 10;
            len++;

        }
        System.out.println(len);
        int[] num2 = new int[len];
        int len2 = len;
        System.out.println(len2);
        int i = 0;
        while (i < len2) {
            num2[i] = num3 % 10;
            num3 = num3 / 10;
            i++;

            //System.out.println(num2[i]);
        }

        System.out.println(Arrays.toString(num2));
        int[] num4 = num2;
        System.out.println(Arrays.toString(num4));
        int j = 0;
        double sum = 0;
        while (j < len2) {
            sum = sum + Math.pow(num4[j], len2);
            j++;
        }
        System.out.println(sum);

        if (num5 == sum)
        {
            System.out.println(num5 + " is a Armstrong Number.");
        }
        else
        {
            System.out.println(num5 + " is Not a Armstrong Number");
        }
    }
}
