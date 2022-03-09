import java.util.Scanner;

public class ForLoopScannerEx {
  public static void main(String[] args) {
    System.out.print("How many times should we repeat this code?  ");
    Scanner sc = new Scanner(System.in);
    int end = sc.nextInt();    // variable, so it can change

    for (int i = 0; i < end; i ++) {
      //  perform some code to repeat
      // for example:
      System.out.println("Are we there yet?");
    }
    sc.close();   // don't forget to close the Scanner 
  }
}
