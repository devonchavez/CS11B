/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 16, 2025
File Name: LabProgram.Java

The program estimates the average calories burned for a person when exercising.
Input:
49 155 148 60
Output:
Calories: 736.21 calories
*/

import java.sql.SQLOutput;
import java.util.Scanner;

public class LabProgram {
    //main method
    public static void main(String[] args) {
        //input variables
        Scanner input = new Scanner(System.in);
        int ageYears;
        int weightPounds;
        int heartBPM;
        int timeMin;
        double avgCal;

        //turning input into ints
        ageYears = input.nextInt();
        weightPounds = input.nextInt();
        heartBPM = input.nextInt();
        timeMin = input.nextInt();

        //avg calories calculation
        avgCal = (ageYears * 0.2757 + weightPounds * 0.03295 + heartBPM * 1.0781 - 75.4992) * timeMin / 8.368;

        //display output
        System.out.print("Calories: ");
        System.out.printf("%.2f",+ avgCal);
        System.out.println(" calories");
    }
}