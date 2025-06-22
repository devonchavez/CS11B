/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 21, 2025
File Name: LabProgram.Java

The program takes 3 ints from the user and displays smallest int
Input:
7 15 3
Output:
3
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);

        //input swaps to ints
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        //check and display smallest int
        if (num1 < num2 && num1 < num3){
            System.out.println(num1);
        } else if (num2 < num3 && num2 < num1) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }

    }
}