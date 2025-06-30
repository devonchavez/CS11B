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

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class LabProgram {
    //swap ints method
    public static void swapValues(int[] values){
        System.out.println(values[1] + " " + values[0] + " " + values[3] + " " + values[2]);
    }

    //main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();

        //creating new array with a length of 4
        int[] numArr = new int[4];

        //assigning user input to arr
        numArr[0] = num1;
        numArr[1] = num2;
        numArr[2] = num3;
        numArr[3] = num4;

        //calling swap values
        swapValues(numArr);


    }
}