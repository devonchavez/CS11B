/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 26, 2025
File Name: LabProgram.Java

This program will count how many characters are in a string the user inputs.

Ex: If the input is:

n Monday
the output is:

1 n
Ex: If the input is:

z Today is Monday
the output is:

0 z's
Ex: If the input is:

n It's a sunny day
the output is:

2 n's
Case matters.

Ex: If the input is:

n Nobody
the output is:

0 n's
n is different than N.
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //scanner and variables
        Scanner scnr = new Scanner(System.in);
        char userChar = scnr.next().charAt(0);
        String userString = scnr.nextLine();
        int numLetters = 0;

        //read through the char and ints, count how many chars are in the user string
        for (int i = 0; i < userString.length(); i++) {
            if (userString.charAt(i) == userChar) {
                numLetters += 1;
            }

        }

        //display output
        if (numLetters == 1){
            System.out.println(numLetters + " " + userChar);
        } else {
            System.out.println(numLetters + " " + userChar + "'s");
        }
    }
}