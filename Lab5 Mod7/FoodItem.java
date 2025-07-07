/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: FoodItem.Java

Create a class FoodItem that takes in user input for the name of a food, fat, carb and protein content, calc the servings and displays output

Ex: If the input is:

Water
the output is:

Nutritional information per serving of Water:
  Fat: 0.00 g
  Carbohydrates: 0.00 g
  Protein: 0.00 g
Number of calories for 1.00 serving(s): 0.00
Ex: If the input is:

M&M's
10.0
34.0
2.0
3.0
where M&M's is the food name, 10.0 is the grams of fat, 34.0 is the grams of carbohydrates, 2.0 is the grams of protein, and 3.0 is the number of servings, the output is:

Nutritional information per serving of M&M's:
  Fat: 10.00 g
  Carbohydrates: 34.00 g
  Protein: 2.00 g
Number of calories for 1.00 serving(s): 234.00
Number of calories for 3.00 serving(s): 702.00
*/
public class FoodItem {
   // private fields
   private String name;
   private double fat;
   private double carbs;
   private double protein;

   // defined default constructor
   public FoodItem(){
      name = "Water";
      fat = 0.00;
      carbs = 0.00;
      protein = 0.00;
   }

   // 2nd constructor that initializes input
   public FoodItem(String userName, double userFat, double userCarbs, double userProtien) {
      name = userName;
      fat = userFat;
      carbs = userCarbs;
      protein = userProtien;
   }

   //name getter
   public String getName() {return name; }

   //fat gtter
   public double getFat() {
      return fat;
   }

   // carb getter
   public double getCarbs() {
      return carbs;
   }

   //protein getter
   public double getProtein() {
      return protein;
   }

   //get and calc calories
   public double getCalories(double numServings) {
      // Calorie formula
      double calories = ((fat * 9) + (carbs * 4) + (protein * 4)) * numServings;
      return calories;
   }
         
   // display output
   public void printInfo() {
      System.out.println("Nutritional information per serving of " + name + ":");
      System.out.printf("  Fat: %.2f g\n", fat);
      System.out.printf("  Carbohydrates: %.2f g\n", carbs);
      System.out.printf("  Protein: %.2f g\n", protein);
   }
}