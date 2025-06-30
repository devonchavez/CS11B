/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 30, 2025
File Name: LabProgram.Java

Creating a program that switches a list of ints given from the user and swaps their positions in the array.

Ex: If the input is:
3 8 2 4
method swapValues() returns and the main program outputs:
8 3 4 2
The program must define and call a method:
*/

import java.util.Scanner;

public class LabProgram {
    //swap ints method
    public static void swapValues(int[] values){
        int temp;

        //swap index 0 and 1
        temp = values[0];
        values[0] = values[1];
        values[1] = temp;

        //swap index 2 and 3
        temp = values[2];
        values[2] = values[3];
        values[3] = temp;
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //read through user input
        int[] numArr = new int[4];
        for (int i = 0; i < 4; i++) {
            numArr[i] = input.nextInt();
        }

        //call swap values
        swapValues(numArr);

        //display output
        for (int i = 0; i < 4; i++) {
            if (i == numArr.length - 1){
                System.out.print(numArr[i]);
            } else {
                System.out.print(numArr[i] + " ");
            }
        }
        System.out.println();
    }
}