package rahulshettyassignments;

import java.util.Scanner;

public class Stringcopies {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter string: ");
		String a = s.next();
		
		//String a ="Hello";
		if(a.length()>1) 
		{
		System.out.println(a.substring(0, 2).repeat(3));
		}
		else 
		{
			System.out.println(a.repeat(3));	
		}
		System.out.println("Enter string 1: ");
		String x = s.next();
		System.out.println("Enter string 1: ");
		String y = s.next();
		System.out.println(x+y+y+x);
	}
}
