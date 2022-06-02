package santoshassignments;

import java.util.Scanner;

public class sentinel_controlled_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int value;      // to hold number
	      int sum = 0;    // initialize the sum
	      int average =0;

	      // Create a Scanner object for keyboard input.
	      Scanner console = new Scanner(System.in);

	      // Get the first value.
	      System.out.print("Please enter a First value (>0) or terminate with -1: ");
	      value = console.nextInt();

	      while (value != 0)
	      {
	         // Add value to sum
	         sum = sum + value;

	         // Get the next value from the user
	         System.out.print("Enter next integer (enter 0 to quit): ");
	         value = console.nextInt();
	      }

	      // Display the total.
	      System.out.println("Sum of the integers: " + sum);
	}

}
