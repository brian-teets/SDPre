import java.util.Scanner;

public class Objective5Lab3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int userNum;

    System.out.println("Please enter a number: ");
    userNum = scanner.nextInt();

    if (userNum > 0) {
      System.out.println("The number you entered is positive.");
    }
    else if (userNum == 0) {   // here, it's not a variable assignment but a check of equality, so I used ==  
      System.out.println("The number you entered is 0.");
    }
    else {
      System.out.println("The number you entered is negative.");
    }

    scanner.close();
  }
}
