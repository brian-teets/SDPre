public class Objective7Lab4 {
  public static void main(String[] args) {
    int count = 1;  // count of 1 through 20
    int currentSum = 1;

    while (count < 20) {  // loop a total of 20 times
      count = count + 1;  // increment the count
      currentSum = currentSum + count;  // update current sum by adding count to currentSum with each iteration
    }
    System.out.println(currentSum);  // based on the Expected Output, only print the sum at the end of the loop
  }
}
