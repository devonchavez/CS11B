/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 9, 2025
File Name: PetInformation.java

Create a class petInformation that takes in input from the user and prints out information from a generic pet class and derived cat class.

Ex. If the input is:
Dobby
2
Kreacher
3
Scottish Fold

the output is:
Pet Information:
   Name: Dobby
   Age: 2
Pet Information:
   Name: Kreacher
   Age: 3
   Breed: Scottish Fold
*/

import java.util.Scanner;

public class PetInformation {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      //myPet object and mycat object that derives from pet
      Pet myPet = new Pet();
      Cat myCat = new Cat();

      //variables
      String petName, catName, catBreed;
      int petAge, catAge;

      //read input into variables
      petName = scnr.nextLine();
      petAge = scnr.nextInt();
      scnr.nextLine();
      catName = scnr.nextLine();
      catAge = scnr.nextInt();
      scnr.nextLine();
      catBreed = scnr.nextLine();
      
      //Creating generic pet that sets user input and displays info form pet class
      myPet.setName(petName);
      myPet.setAge(petAge);

      myPet.printInfo();

      //Creating myCat that sets user input and displays info from cat that derives from pet class
      myCat.setName(catName);
      myCat.setAge(catAge);
      myCat.setBreed(catBreed);

      myCat.printInfo();
      //display breed of cat
      System.out.println("   Breed: " + myCat.getBreed());
   }
}