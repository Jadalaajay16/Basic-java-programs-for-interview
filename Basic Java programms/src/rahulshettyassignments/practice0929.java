package rahulshettyassignments;



/*Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1. 
The given n may be 0, in which case just return a length 0 array.
Ex1:(4)  [0, 1, 2, 3]
Ex2:(1)  [0]
Ex3:(10)  [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
Ex4:(0)  [0] */

import java.util.ArrayList;
import java.util.Scanner;
public class practice0929 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> a = new ArrayList<Integer>();
		
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		n=sc.nextInt();		
		
		for(int i=0;i<n;i++)
		{
			a.add(i);
			
		}
		System.out.println(a);
	}

}
