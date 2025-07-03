/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 30, 2025
File Name: LabProgram.Java

Creating a program that takes in a random integer and displays that integers ammount of times a coinflip occurs, displaying either heads or tails.

Ex: If the random object is created with a seed value of 2 and the input is:
3
the output is:
Heads
Tails
Heads
*/

import java.util.Random;
import java.util.Scanner;

public class LabProgram {
    public static String coinFlip(Random rand) {
        String heads = "Heads";
        String tails = "Tails";

        if (rand.nextInt(2) > 0) {
            return heads;
        } else {
            return tails;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        Random random = new Random(2);

        for (int i = 0; i < num; i++){
            System.out.println(coinFlip(random));
        }

    }
}