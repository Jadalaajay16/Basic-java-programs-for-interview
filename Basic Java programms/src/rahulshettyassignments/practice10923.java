package rahulshettyassignments;

import java.util.Scanner;
/*Ask user to input a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.
		Ex1:("Hello", 2)  "Helo"  
		Ex2:("Chocolate", 3)  "Choate"  
		Ex3:("Chocolate", 1)  "Ce"
		Ex4:("Hello", 1) "Ho" */

public class practice10923 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string");
		String s =a.next();
		System.out.println("Index");
		int index = a.nextInt();
		System.out.println(s.substring( 0, index).concat(s.substring(s.length()-index)));
	
	}

}
