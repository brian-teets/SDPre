/*
/ Unlike while loops, or loops always execute code a determined or pre-determined number of times.

/ Syntax of for loops:

/ for (initialization; termination condition; increment) {
/  loop body
/ }

*/

public class ForLoopParts {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i += 1) {
      System.out.println(i);
    }
  }
}

/*
/ 1. Declare an int variable named i and assign it the value 0 (aka initialization).
/ 2. Check the termination condition, since we assigned it an initial value of 0, 0 is less than 5, so this will evaluate to true (termination condition).
/ 3. Execute the loop body if step 2 evaluated to true.
/ 4. Add 1 to the value of i (increment).
/ 5. Return to step 2 (check the termination condition).
*/
