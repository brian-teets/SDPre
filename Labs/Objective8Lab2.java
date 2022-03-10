public class Objective8Lab2 {
  public static void main(String[] args) {
    int currentSum = 0;  // variable to store current sum total. starting at 0.

    // for loop
    // expected output == 210
    for (int control = 1; control <= 20; control ++) {   // starting with a control of 1 and going up to and including 20
      currentSum = currentSum + control;   // currentSum calculated by currentSum + the control variable 
    }
    System.out.println(currentSum);
  }
}
