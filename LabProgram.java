/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 16, 2025
File Name: LabProgram.Java

The program takes 3 integers from the user and manipulates its values.
Input:
3.6 4.5 2.0
Output:
12.96 1.841304610218211E11 4.5 16.2
*/

import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double y = input.nextDouble();
        double z = input.nextDouble();

        //calculations
        double xToZ = Math.pow(x, z); // x^z
        double xToYToZ = Math.pow(x, Math.pow(y, z)); // (x^z)^y
        double absY = Math.abs(y); // |y|
        double sqrtXYToZ = Math.sqrt(Math.pow(x * y, z)); // sqrt((x*y)^z)


        System.out.println(xToZ + " " + xToYToZ + " " + absY + " " + sqrtXYToZ);

    }
}