public class NestedIfStatement {
  public static void main(String[] args) {
    boolean hasSpoon, isHotOutside, isColdOutside, likesSpicyFoods;
      hasSpoon = true;    // if false, then nothing gets printed
      isHotOutside = false;
      isColdOutside = true;
      likesSpicyFoods = true;

      /*
      * Switch up the boolean variable values on lines 4-7 to change the end result!
      */

      if (hasSpoon) {
        if (isHotOutside) {
          System.out.println("Go get some ice cream!");
        }
        else if (isColdOutside) {
          if (likesSpicyFoods) {
            System.out.println("Get some spicy chili!");
          }
          else {
            System.out.println("Get some tomato soup!");
          }
        }
        else {
          System.out.println("...why do you have a spoon?");
        }
      }
  }
}
