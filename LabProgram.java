/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 21, 2025
File Name: LabProgram.Java

The program takes in a year from the user and displays wether or not its a leap year
Ex: If the input is:

1712
the output is:

1712 - leap year
Ex: If the input is:

1913
the output is:

1913 - not a leap year
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);
        //change input to ints
        int leapYear = input.nextInt();

        //checks if leap year
        if (leapYear % 4 != 0 ){
            System.out.println(leapYear + " - not a leap year");
        } else if(leapYear % 100 == 0 && leapYear % 400 != 0) {
            System.out.println(leapYear + " - not a leap year");
        }else {
            System.out.println(leapYear + " - leap year");
        }

    }
}