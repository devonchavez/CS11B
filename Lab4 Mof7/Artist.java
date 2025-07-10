/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: Artist.Java

Create a class Artist, that takes in input from the user and displays the name and brithdate - deathdate of the artist

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
public class Artist {
   // private fields
    private String artistName;
    private int birthYear;
    private int deathYear;

   // default constructor for empty input
    public Artist(){
        artistName = "unknown";
        birthYear = -1;
        deathYear = -1;
    }

   // 2nd constructor that instantiates user input
   public Artist(String userArtist, int userBirthYear, int userDeathYear){
        artistName = userArtist;
        birthYear = userBirthYear;
        deathYear = userDeathYear;
   }

   //getter for name
    public String getName() {return artistName;}
    //getter for birthyear
    public int getBirthYear() {return birthYear;}
    //getter for death year
    public int getDeathYear() {return deathYear;}

    // display output
    public void printInfo(){
        System.out.print("Artist: " + getName());

        if (getBirthYear() > 0 && getDeathYear() > 0){
            System.out.println(" (" + getBirthYear() + " to " + getDeathYear() + ")");
        } else if (getBirthYear() > 0 && getDeathYear() < 0){
            System.out.println(" (" + getBirthYear() + " to present)");
        } else {
            System.out.println(" (unknown)");
        }

    }
}