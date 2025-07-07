/*
Name: Devon Chavez
Course: CS 111B Programming Fundamentals: Java
Instructor: Dave Harden
Date: July 6, 2025
File Name: Car.java

Take in input from the loser from their sports team and scores, calculate their win percentage and display whether or not they have a winning average or not

Ex: If the input is:

Ravens
13
3
where Ravens is the team's name, 13 is the number of team wins, and 3 is the number of team losses, the output is:

Win percentage: 0.81
Congratulations, Team Ravens has a winning average!
Ex: If the input is:

Angels
80
82
the output is:

Win percentage: 0.49
Team Angels has a losing average.
*/

public class Team {
   // Declared private fields
   private String name;
   private int wins;
   private int losses;
   
   //defined mutators
    public void setName(String userName) {name = userName;}
    public void setWins(int userWins) {wins = userWins;}
    public void setLosses(int userLossses) {losses = userLossses;}

   //defined accesors
    public String getName() {return name;}
    public int getWins() {return wins;}
    public int getLosses() {return losses;}

    //defined and calculated win percentage
    public double getWinPercentage( ){
        return (double) getWins() / (getWins() + getLosses());
    }
   
    //defined and displayed output
    public void printStanding(){
        double winPercentage = getWinPercentage();

        System.out.printf("Win percentage: %.2f\n", + getWinPercentage());
        if (winPercentage >= 0.5 ) {
            System.out.println("Congratulations, Team " + getName() + " has a winning average!");
        } else {
            System.out.println("Team " + getName() + " has a losing average.");
        }
    }
   
}