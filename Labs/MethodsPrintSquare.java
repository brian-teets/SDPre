public class MethodsPrintSquare {
  public static void main(String[] args) {
    printSquare();
    System.out.println();
    printRectangle();
  }

  // printSquare method:
  public static void printSquare() {
    int i = 1;
    while (i < 11) {
      i = i + 1;
      System.out.println("XXXXXXXXXXXXXXXXXXXX");
    }
  }

  // printRectangle method:
  public static void printRectangle() {
    printSquare();
    printSquare();
  }
}
