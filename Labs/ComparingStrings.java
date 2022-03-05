import java.util.Scanner;

public class ComparingStrings {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.println("Please enter the word \"wombat\": ");
    String wombat = kb.nextLine();
    // boolean isWombat = (wombat == "wombat");
    boolean isWombat = wombat.equals("wombat");
    System.out.println("You successfully entered the word \"wombat\": " + isWombat + "\n");

    System.out.println("Please DO NOT enter the word \"wombat\": ");
    String notWombat = kb.nextLine();
    boolean isNotWombat = !(notWombat.equals("wombat"));
    System.out.println("You successfully DID NOT enter the word \"wombat\": " + isNotWombat);

    kb.close();
  }
}
