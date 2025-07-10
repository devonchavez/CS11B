/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: Car.java

Given the Triangle class, complete the program that calculates input from the user, converts it to the base and hright of a triangle and print whichever triangle is the smallest along with their measurements

Ex: If the input is:
2011
18000
2018
where 2011 is the car's model year, 18000 is the purchase price, and 2018 is the current year, the output is:

Car's information:
  Model year: 2011
  Purchase price: $18000
  Current value: $5770
*/


public class Car {
   //declare private fields
   private int modelYear;
   private int purchasePrice;
   public int currentValue;

   //set for user mofel year to modelyaer
   public void setModelYear(int userYear){
      modelYear = userYear;
   }

   //get model year
   public int getModelYear() {
      return modelYear;
   }

   //set user purchase price to purchasePrice
   public void setPurchasePrice(int userPrice) { purchasePrice = userPrice; }

   //get purchase price
   public int getPurchasePrice() {return purchasePrice; }

   //calclate the depreciation value of the cars age
   public void calcCurrentValue(int currentYear) {
      double depreciationRate = 0.15;
      int carAge = currentYear - modelYear;
      
      // Car depreciation formula
      currentValue = (int) Math.round(purchasePrice * Math.pow((1 - depreciationRate), carAge));
   }
   
   //display output
   public void printInfo(){
      System.out.println("Car's information:");
      System.out.println("  Model year: " + getModelYear());
      System.out.println("  Purchase price: $" + getPurchasePrice());
      System.out.println("  Current value: $" + currentValue);
   }
}