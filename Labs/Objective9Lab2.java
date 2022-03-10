public class Objective9Lab2 {
  public static void main(String[] args) {
    System.out.println("In main");
    printMessage();   // calls the printMessage method 
    System.out.println("In main");
  }

  // printMessage method:
  public static void printMessage() {
    System.out.println("In method");
  }
}

/*
Expected Output:

In main
In method
In main
*/
