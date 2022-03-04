public class Objective3Lab2 {
  public static void main(String[] args) {
    double side1, side2, hypotenuse;

    side1 = 10.0;
    side2 = 8.0;

    // side1Squared + side2Squared = side3Squared
    // hypotenuse = squareRoot of side1 * side1 + side2 * side2
    // Plus, I know based on the information given from the lab that...
    // The hypotenuse of a triangle with sides 10.0 and 8.0 is 12.806248474865697
    // So, I know that if I use those same values for side1 and side2, it has to equal 12.806248474865697
    hypotenuse = Math.sqrt(side1 * side1 + side2 * side2);

    System.out.println(hypotenuse);
  }
}
