package santoshassignments;

import java.util.Scanner;

public class multiplicationTable_UsingForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int number = input.nextInt();
		System.out.println("Multiplication table for 3");
		
		System.out.println( "Multiplier  Result");
		System.out.println("--------------------------------");
		for(int i=1;i<=10;i++)
		{
			System.out.println("    "+i +"        "+ i*number);
		}
	}

}
