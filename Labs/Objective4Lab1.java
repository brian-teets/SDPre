import java.util.Scanner;

public class Objective4Lab1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);   // creates a new Scanner object with variable name of keyboard

    String fname = "";
    String lname = "";
    String favoriteAnimal = "";
    String favoriteFood = "";
    String favoriteSong = "";

    // TODO prompt the user to get input for each of the String variables.
    // prompt for first name
    System.out.println("What is your first name?");
    // read the first name data and store it in String variable fname
    fname = keyboard.nextLine();  // keyboard is the name of the Scanner oject, so referencing that here to read and store fname String

    System.out.println("What is your last name?");
    lname = keyboard.nextLine();

    System.out.println("What is your favorite animal?");
    favoriteAnimal = keyboard.nextLine();

    System.out.println("What is your favorite food?");
    favoriteFood = keyboard.nextLine();

    System.out.println("What is your favorite song?");
    favoriteSong = keyboard.nextLine();


    // TODO print the output formatted to look like the expected output using String concatenation.
    System.out.println("My name is " + fname + " " + lname + ".");
    System.out.println("My favorite animal is the " + favoriteAnimal + ".");
    System.out.println("My favorite food is " + favoriteFood + ".");
    System.out.println("My favorite song is " + favoriteSong + ".");

    keyboard.close();

  }
}
