/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 30, 2025
File Name: LabProgram.Java

Create a program that takes in string input from the user and puts them into an array, the program will count the frequeny ammount of times the strings appear within the users input

Ex: If the input is:
5 hey Hi Mark hi mark
the output is:
hey 1
Hi 2
Mark 2
hi 2
mark 2
*/

import java.util.Scanner;

public class LabProgram {

    public static int fibonacci(int n){
        int nthVal = 0;
        int prev1 = 0;
        int prev2 = 1;

        if (n < 0){
            return -1;
        } else if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        //swap and add sum of previous values
        for (int i = 2; i <= n; i++) {
            nthVal = prev1 + prev2;
            prev1 = prev2;
            prev2 = nthVal;
        }

        return nthVal;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();

        //display output
        System.out.println("fibonacci("+ userNum + ") is " + fibonacci(userNum));

    }
}