public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;   // beginning counter value

    while (counter <= 20) {
      // count up from 1 through 20 printing the number and whether the number is odd or even
      // write an if statement to determine if the number is odd or even using % operator
      if (counter % 2 == 0) {
        System.out.println(counter + " is even");   // print counter is even based on % result
      }
      else {
        System.out.println(counter + " is odd");   // if the counter value is not even, then it is odd. print the value.
      }

      counter = counter + 1;  // increment the counter value
    }
  }
}
