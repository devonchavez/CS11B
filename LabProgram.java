/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 21, 2025
File Name: LabProgram.Java

Create a username for the user with their information
Ex: If the input is:

Michael Jordan 1991
the output is:

Your login name: MichaeJ_1
Ex: If the input is:

Nicole Smith 2024
the output is:

Your login name: NicoleS_4
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);

        // Get the user's first name
        String firstName = input.next();
        String lastName = input.next();

        int number = input.nextInt();
        int lastDigit = number % 10;

        String shortFirstName;
        String lastInitial = lastName.substring(0, 1);

        // Get first 6 letters of first name
        if (firstName.length() < 6) {
            shortFirstName = firstName;
        } else {
            shortFirstName = firstName.substring(0, 6);
        }

        String login = shortFirstName + lastInitial + "_" + lastDigit;

        System.out.println("Your login name: " + login);
    }
}
