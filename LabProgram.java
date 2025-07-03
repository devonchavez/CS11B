/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 30, 2025
File Name: LabProgram.Java

Create a program that takes in string input from the user and puts them into an array, the program will count the frequeny ammount of times the strings appear within the users input

Ex: If the input is:
5 hey Hi Mark hi mark
the output is:
hey 1
Hi 2
Mark 2
hi 2
mark 2
*/

import java.util.Scanner;

public class LabProgram {
    public static int getWordFrequency(String[] wordsList, int listSize, String currWord){
        int counter = 0;
        //count how many times a word matches the current word in the string
        for (int i = 0; i < listSize; i++){
            if (wordsList[i].equalsIgnoreCase(currWord)) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userNum = input.nextInt();
        String[] userArr = new String[userNum];

        //add all user input into an array
        for (int i = 0; i < userArr.length; i++){
            String userInp = input.next();
            userArr[i] = userInp;
        }

        //add each frequency to each word in array
        for (String s : userArr) {
            int freq = getWordFrequency(userArr, userNum, s);
            System.out.print(s + " " + freq);
            System.out.println();
        }
    }

}