/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 26, 2025
File Name: LabProgram.Java

Take in a series of numbers and return the max and average of the series.

Ex: When the input is:
15 20 0 3 -1

the output is:
20 9.50
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //scanner and variables
        Scanner scnr = new Scanner(System.in);
        int userNum;
        double avgNum;
        int counter = 0;
        int maxNum = -1 ;
        double sumNum = 0;

        //read numbers until neg number
        while(true){
            userNum = scnr.nextInt();
            if (userNum < 0) {
                break;
            }

            //create a sum of numbers and how many of them there are
            sumNum += userNum;
            counter++;

            //find max num
            if (userNum > maxNum) {
                maxNum = userNum;
            }
        }

        //calc avg
        avgNum = sumNum / counter;

        //display output
        System.out.print(maxNum + " ");
        System.out.printf("%.2f\n", avgNum);

    }
}