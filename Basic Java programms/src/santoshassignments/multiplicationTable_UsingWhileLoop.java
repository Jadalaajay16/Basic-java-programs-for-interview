
package santoshassignments;

import java.util.Scanner;

/*Description: Program to display the multiplication facts for a number. The user will enter a 
value and then a table will be displayed showing the multiplication facts for that 
value. Using a while-loop*/

public class multiplicationTable_UsingWhileLoop {

	public static void main(String[] args) {
		
		int i = 1; 
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		System.out.println("Multiplication table for 3");
		
		System.out.println( "Multiplier  Result");
		System.out.println("--------------------------------");
		
		while(i<=10)
		{
			System.out.println("    "+i +"        "+ i*number);
			i++;
		}
	}

}
