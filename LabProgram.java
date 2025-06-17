/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 16, 2025
File Name: LabProgram.Java

The program takes in the users total nickles, dimes, and quarters and converts it into a total dollar ammount
Input:
3 1 4
Output:
Amount: $1.25
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);

        //input swaps to ints
        int numNick = input.nextInt();
        int numDime = input.nextInt();
        int numQuar = input.nextInt();

        //currency values
        numNick *= 5;
        numDime *= 10;
        numQuar *= 25;

        //total calculations
        double dolTotal = (numNick + numDime + numQuar) / 100.0;

        //displaying output
        System.out.print("Amount: ");
        System.out.printf("$%.2f\n", dolTotal);

    }
}