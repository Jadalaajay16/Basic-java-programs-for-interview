package rahulshettyassignments;

import java.util.Scanner;

public class practice0925 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string");
		String s =a.next();
		if(s.split("dog",-1).length-1 == s.split("cat",-1).length-1)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}

}
