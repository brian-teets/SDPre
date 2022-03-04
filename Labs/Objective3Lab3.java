public class Objective3Lab3 {
  public static void main(String[] args) {
    int first, second, third;

    // Given from the lab info: 1 + (int)(Math.random() * 6);
    // Must initialize each variable, so here's what I came up with...

    first = 1 + (int)(Math.random() * 6);
    second = 1 + (int)(Math.random() * 6);
    third = 1 + (int)(Math.random() * 6);

    // Print the result of the first random integer + second random integer + the third random integer
    // Originally I had it written as:  System.out.println(first + second + third);
    // But, I wanted it to print out and look like the expected result from the lab example
    // which would also print out each of the three random numbers
    // I then realized that I had to enclose first + second + third inside (), otherwise it would concatenate and print as a string
    System.out.println(first + " + " + second + " + " + third + " + " + " = " + (first + second + third));
  }
}
