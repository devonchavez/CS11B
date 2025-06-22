/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 21, 2025
File Name: LabProgram.Java

The program takes in the users interstate highway numbers and displays which one theyre taking and which direction its going
Ex: If the input is:

90
the output is:

I-90 is primary, going east/west.
Ex: If the input is:

290
the output is:

I-290 is auxiliary, serving I-90, going east/west.
Ex: If the input is:

0
or any number not between 1 and 999, the output is:

0 is not a valid interstate highway number.
Ex: If the input is:

200
the output is:

200 is not a valid interstate highway number.

*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);

        //input swaps to ints
        int highwayNumber = input.nextInt();

        //invalid highway numbers
        if (highwayNumber < 1 || highwayNumber > 999) {
            System.out.println(highwayNumber + " is not a valid interstate highway number.");
        } else if (highwayNumber >= 1 && highwayNumber <= 99) {
            // Primary highway
            if (highwayNumber % 2 == 0) {
                System.out.println("I-" + highwayNumber + " is primary, going east/west.");
            } else {
                System.out.println("I-" + highwayNumber + " is primary, going north/south.");
            }
        } else {
            // Auxiliary highway
            int primaryHighway = highwayNumber % 100;

            if (primaryHighway == 0) {
                System.out.println(highwayNumber + " is not a valid interstate highway number.");
            } else {

                if (primaryHighway % 2 == 0) {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryHighway + ", going east/west.");
                } else {
                    System.out.println("I-" + highwayNumber + " is auxiliary, serving I-" + primaryHighway + ", going north/south.");
                }
            }
        }
    }
}