/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: TriangleArea.java

Given the Triangle class, complete the program that calculates input from the user, converts it to the base and hright of a triangle and print whichever triangle is the smallest along with their measurements

Ex: If the input is:
3.0 4.0
4.0 5.0
where 3.0 is triangle1's base, 4.0 is triangle1's height, 4.0 is triangle2's base, and 5.0 is triangle2's height, the output is:

Triangle with smaller area:
Base: 3.00
Height: 4.00
Area: 6.00
*/

import java.util.Scanner;

public class TriangleArea {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      //creating object that calls triangle
      Triangle triangle1 = new Triangle();
      Triangle triangle2 = new Triangle();

      //assigning the sides that the input will be read as
      double userBase = scnr.nextDouble();
      double userHeight = scnr.nextDouble();

      //setting the input as base and height
      triangle1.setBase(userBase);
      triangle1.setHeight(userHeight);

      //calling the method in triangle to calc the area using base and height input
      double triangleOne = triangle1.getArea();

      //repeat steps for triangle 2
      double nextBase = scnr.nextDouble();
      double nextHeight = scnr.nextDouble();

      triangle2.setBase(nextBase);
      triangle2.setHeight(nextHeight);

      double triangleTwo = triangle2.getArea();
      
      System.out.println("Triangle with smaller area:");

      //compare which triangle is smaller than the other and display output
       if (triangleOne < triangleTwo) {
          triangle1.printInfo();
       } else {
          triangle2.printInfo();
       }
   }
}
