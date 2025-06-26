/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 26, 2025
File Name: LabProgram.Java

The program takes in string input from the user and reverses it till they are done.

Ex: If the input is:
Hello there
Hey
done

the output is:
ereht olleH
yeH
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String numString;

        //loop repeats till user wants to stop
        while (true) {
            numString = scnr.nextLine();

            //checks if user wants to quit
            if (numString.equals("Done") || numString.equals("done") || numString.equals("d")) {
                break;
            }

            //print reverse string
            for (int i = numString.length() - 1; i >= 0; i--) {
                System.out.print(numString.charAt(i));
            }

            //newline
            System.out.println();
        }

    }
}


