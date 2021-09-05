/*
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Steven Iannucci
 */

import java.util.Scanner;

public class Solution05 {

    public static void main(String[ ] args) {
        //print "What is the first number? "
        //ask for user input to variable str1
        //convert str1 to integer (num1)
        //print "What is the second number? "
        //ask for user input to variable str2
        //convert str2 to integer (num2)
        //create variables for mathematical operators and results
        //print all results including the two numbers given from user
        Scanner input = new Scanner(System.in);
        System.out.println("What is the first number? ");
        String str1 = (input.nextLine());
        int num1 = Integer.parseInt(str1);
        System.out.println("What is the second number? ");
        String str2 = (input.nextLine());
        int num2 = Integer.parseInt(str2);
        int res1 = num1 + num2;
        int res2 = num1 - num2;
        int res3 = num1 * num2;
        int res4 = num1 / num2;
        System.out.printf("%d + %d = %d%n", num1, num2, res1);
        System.out.printf("%d - %d = %d%n", num1, num2, res2);
        System.out.printf("%d * %d = %d%n", num1, num2, res3);
        System.out.printf("%d / %d = %d%n", num1, num2, res4);
    }
}

