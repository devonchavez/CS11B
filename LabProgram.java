/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 26, 2025
File Name: LabProgram.Java

This program will read in 2 ints from the user where each range act as bounds for a range and will display its range between the 2 numbers in increments of 5.

Ex: If the input is:
-15 10
the output is:
-15 -10 -5 0 5 10

Ex: If the second integer is less than the first as in:
20 5
the output is:
Second integer can't be less than the first.
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int num1 = scnr.nextInt();
        int num2 = scnr.nextInt();

        // if error, send msg
        if (num1 > num2) {
            System.out.println("Second integer can't be less than the first.");
        } else {
            int current = num1;

            //loop while num1 is less then num2
            while (current <= num2) {
                System.out.print(current);

                //print space
                if (current + 5 <= num2) {
                    System.out.print(" ");
                }
                current += 5;
            }
            System.out.print(" ");
        }

    }
}
