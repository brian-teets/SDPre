import java.util.Scanner;

public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    // since the loop condition is while true, inifinite loop unless user selection == 3, which should break the loop and exit the program
    while(true) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      selection = scanner.nextInt();  // records and stores the user input

      if (selection == 1) {
        System.out.println("Hello Human");
      }
      if (selection == 2) {
        System.out.println("Apple, Banana, Coconut");
      }
      else if (selection == 3) {
        System.out.println("Goodbye");
        break;
      }
    }
    scanner.close();   // the statement to close the scanner goes outside the while loop 
  }
}
