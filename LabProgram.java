/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 26, 2025
File Name: LabProgram.Java

This program will read string input from the user and remove and non alpha numbers from the string.

Ex: If the input is:
-Hello, 1 world$!

the output is:
Helloworld
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //scanner and variables
        Scanner scnr = new Scanner(System.in);
        String userString = scnr.nextLine();

        //read through the string
        for (int i = 0; i < userString.length(); i++){
            //check if string is an alpha number
            if (Character.isLetter(userString.charAt(i))){
                System.out.print(userString.charAt(i));
            }
        }
        System.out.println();

    }
}