/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 21, 2025
File Name: LabProgram.Java

The program takes in first, middle initial and last name and orders them in last, first, and middle initial.
Ex: If the input is:

Pat Silly Doe
the output is:

Doe, P.S.
If the input has the form:

firstName lastName

the output is:

lastName, firstInitial.

Ex: If the input is:

Julia Clark
the output is:

Clark, J.
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input 
        Scanner input = new Scanner(System.in);
        // read first and second names
        String firstName = input.next();
        String secondWord = input.next();

        String firstInitial = firstName.substring(0, 1);

        // check if there's a third word
        if (input.hasNext()) {
            String middleName = secondWord;
            String lastName = input.next();

            String middleInitial = middleName.substring(0, 1);

            System.out.println(lastName + ", " + firstInitial + "." + middleInitial + ".");
        } else {
            String lastName = secondWord;

            System.out.println(lastName + ", " + firstInitial + ".");
        }
    }
}