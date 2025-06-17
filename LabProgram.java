/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 16, 2025
File Name: LabProgram.Java

The program takes in the users name and displays a message.
Input:
Pat
Output:
Hey Pat!
Welcome to zyBooks!
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);
        String name = input.next();

        System.out.println("Hey " + name + "!");
        System.out.println("Welcome to zyBooks!");

    }
}