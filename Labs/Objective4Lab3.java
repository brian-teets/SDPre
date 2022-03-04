import java.util.Scanner;

public class Objective4Lab3 {
  public static void main(String[] args) {
    int birthYear, age, currentYear;

    birthYear = 0;

    Scanner input = new Scanner(System.in);
    System.out.println("How old are you?");

    // read and store the user's age into the variable age
    age = input.nextInt();
    currentYear = 2022;
    birthYear = (currentYear - age);

    // print the calculated birthYear
    System.out.println("Wow! So, you were born in " + birthYear + ", huh?");

    // close the input Scanner
    input.close();
  }
}
