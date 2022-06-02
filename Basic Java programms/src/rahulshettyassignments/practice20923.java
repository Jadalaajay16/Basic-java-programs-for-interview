package rahulshettyassignments;

import java.util.Scanner;

/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string, The string may be any length, including 0.
Ex1:("badxx")  true
Ex2:("xbadxx")  true
Ex3:("xxbadxx")  false*/

public class practice20923 {

	public static void main(String[] args) {
		
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string");
		String s =a.next();
		if(s.indexOf("bad")==0 || s.indexOf("bad")==1 )
		{
			System.out.println(true);
		}
		else 
		{
			System.out.println(false);	
		}
	}
}
