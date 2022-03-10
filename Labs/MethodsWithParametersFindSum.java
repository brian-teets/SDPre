import java.util.Scanner;

public class MethodsWithParametersFindSum {
  public static void main(String[] args) {
    double num1, num2;
    Scanner kb = new Scanner(System.in);
    System.out.println("Please give me a number: ");
    num1 = kb.nextDouble();
    System.out.println("Please give me another number: ");
    num2 = kb.nextDouble();

    findSum(num1, num2);

  }

  public static void findSum(double x, double y) {
    System.out.println(x + y);
  }
}
