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
        // Get total amount in pennies
        int leapYear = input.nextInt();

        if (totalPennies == 0) {
            System.out.println("No change");
        } else {
            // Calculate each coin type
            int dollars = totalPennies / 100;
            totalPennies = totalPennies % 100;

            int quarters = totalPennies / 25;
            totalPennies = totalPennies % 25;

            int dimes = totalPennies / 10;
            totalPennies = totalPennies % 10;

            int nickels = totalPennies / 5;
            totalPennies = totalPennies % 5;

            int pennies = totalPennies;

            //Output each denomination of currency
            if (dollars > 0) {
                if (dollars == 1) {
                    System.out.println("1 Dollar");
                } else {
                    System.out.println(dollars + " Dollars");
                }
            }

            if (quarters > 0) {
                if (quarters == 1) {
                    System.out.println("1 Quarter");
                } else {
                    System.out.println(quarters + " Quarters");
                }
            }

            if (dimes > 0) {
                if (dimes == 1) {
                    System.out.println("1 Dime");
                } else {
                    System.out.println(dimes + " Dimes");
                }
            }

            if (nickels > 0) {
                if (nickels == 1) {
                    System.out.println("1 Nickel");
                } else {
                    System.out.println(nickels + " Nickels");
                }
            }

            if (pennies > 0) {
                if (pennies == 1) {
                    System.out.println("1 Penny");
                } else {
                    System.out.println(pennies + " Pennies");
                }
            }
        }
    }
}
