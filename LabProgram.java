/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: June 30, 2025
File Name: LabProgram.Java



Ex: If the input is:
5 10 4 39 12 2
the output is:
39,12,10,4,2,
*/

import java.util.Scanner;

public class LabProgram {
    public static void sortArray(int[] myArr, int arrSize){
        //sort array
        for (int i = 0; i < arrSize - 1; i++) {
            for (int j = i + 1; j < arrSize; j++){
                if (myArr[j] > myArr[i]){
                    int tempVal = myArr[i];
                    myArr[i] = myArr[j];
                    myArr[j] = tempVal;
                }
            }
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] userArr = new int[n];

        //add nums from user input into an array
        for (int i = 0; i < userArr.length; i++){
            int userNum = input.nextInt();
            userArr[i] = userNum;
        }
        //call sort array
        sortArray(userArr, n);

        //display new array
        for (int i : userArr) {
            System.out.print(i + ",");
        }
        System.out.println();

    }
}