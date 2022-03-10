public class Objective8Lab3 {
  public static void main(String[] args) {

    for (int counter = 1; counter <= 20; counter ++) {
      if (counter % 2 == 0) {
        System.out.println(counter + " is even ");
      }
      else {
        System.out.println(counter + " is odd");
      }
    }
  }
}
// I have a for loop
// and an if - else statement using the modulus operator
// and the code compiles without any errors
// and prints the expected output

/*
Expected Output:

1 is odd
2 is even
3 is odd
4 is even
5 is odd
6 is even
7 is odd
8 is even
9 is odd
10 is even
11 is odd
12 is even
13 is odd
14 is even
15 is odd
16 is even
17 is odd
18 is even
19 is odd
20 is even
*/
