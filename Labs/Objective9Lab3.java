import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int selection;

    while(true) {
      // call the printMenu method
      printMenu();
      // then if block from Objective7Lab5
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
    // close the scanner
    scanner.close();
  }

  // printMenu method
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
