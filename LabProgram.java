/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 16, 2025
File Name: LabProgram.Java

The program will take 2 numbers from the user and display the 1st number divided by the 2nd number 3 times.
Input:
2000 2
Output:
1000 500 250
 */

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);
        int userNum;
        int divNum;

        //convert input to ints
        userNum = input.nextInt();
        divNum = input.nextInt();

        //calculations & display output
        userNum = userNum / divNum;
        System.out.println(userNum);
        userNum = userNum / divNum;
        System.out.println(userNum);
        userNum = userNum / divNum;
        System.out.println(userNum);

    }
}