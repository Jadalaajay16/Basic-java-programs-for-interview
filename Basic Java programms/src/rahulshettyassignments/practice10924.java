package rahulshettyassignments;

import java.util.Scanner;
/*Ask user to input a string, return a new string where for every char in the original, there are two chars.
Ex1: ("The")  "TThhee"
Ex2: ("AAbb")  "AAAAbbbb"
Ex3: ("Hi-There")  "HHii--TThheerree"*/

public class practice10924 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = a.next();
		String j="";
		for(i=0;i<=s.length()-1;i++)
		{
			j += s.substring(i,i+1) + s.substring(i,i+1);
		}
		
		System.out.println(j);
	}
}
