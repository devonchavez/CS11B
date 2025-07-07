/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: Artist.Java

Create a class called Artwork that takes in input from the user and displays the peices title and date created while making an object artist athat along with the art peice displays the artists information

Ex: If the input is:

Pablo Picasso
1881
1973
Three Musicians
1921
the output is:

Artist: Pablo Picasso (1881 to 1973)
Title: Three Musicians, 1921
Ex: If the input is:

Brice Marden
1938
-1
Distant Muses
2000
the output is:

Artist: Brice Marden (1938 to present)
Title: Distant Muses, 2000
Ex: If the input is:

Banksy
-1
-1
Balloon Girl
2002
the output is:

Artist: Banksy (unknown)
Title: Balloon Girl, 2002
*/

public class Artwork {
   // declare private fields
   private String title;
   private int yearCreated;

   // delare artist of type artist
   private Artist artist;

   // default constructor for empty input
   public Artwork() {
      title = "unknown";
      yearCreated = -1;
      artist = new Artist();
   }

   // 2nd constructor that initializes title, yearcreated and artist
   public Artwork (String userTitle, int userYearCreated, Artist artist) {
      title = userTitle;
      yearCreated = userYearCreated;
      this.artist = artist;
   }

   // getters
   public String getTitle() { return title; }
   public int getYearCreated() { return yearCreated;}

   //display output
   public void printInfo(){
      artist.printInfo();
      System.out.println("Title: " + getTitle() + ", " + getYearCreated());
   }

}