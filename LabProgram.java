/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: LabProgram.java

Create a prgoram that creates a vending machine objects and calls methods from the class that takes in user input to track the ammount of water bottles purchased and the ammount needed to restock. subtract the bought water bottles from the total ammount and outputs the total inventory after restock

Ex: If the input is:

5 2
the output is:

Inventory: 17 bottles
*/

import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      //call input from user
      Scanner scnr = new Scanner(System.in);
      //declare vending machine object
      VendingMachine vendingMachine = new VendingMachine();

      //declare int variables
      int purchasedBottles;
      int ammountToRestock;

      //initialize reading ints
      purchasedBottles = scnr.nextInt();
      ammountToRestock  = scnr.nextInt();

      //call vending machine to read bottles purchased and ammount to restock
      vendingMachine.purchase(purchasedBottles);
      vendingMachine.restock(ammountToRestock);

      //call vending machine displayed output
      vendingMachine.report();


   }
}
