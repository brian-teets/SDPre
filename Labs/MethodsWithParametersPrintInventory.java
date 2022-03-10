import java.util.Scanner;

public class MethodsWithParametersPrintInventory {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    String item;
    int quantity;
    System.out.println("Please enter your inventory item: ");
    item = kb.nextLine();
    System.out.println("Please enter the quantity: ");
    quantity = kb.nextInt();

    printInventory(item, quantity);
    // alternatively, we can directly provide the arguments like so:
    // printInventory("tomtatoes", 12);
  }

  // printInventory method
  public static void printInventory(String inventoryItem, int numberOfInventoryItems) {
    System.out.println("There are currently " + numberOfInventoryItems + " " + inventoryItem + " remaining.");
  }
}
