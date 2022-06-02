package rahuludemyprograms;

import java.util.Scanner;

public class palindromeof_string_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    
		        String original, reverse = "";
		        Scanner in = new Scanner(System.in);
		       
		        System.out.println("Enter the number or String");
		        original = in.nextLine();
		        int length = original.length();
		        for (int i =length -1; i>=0; i--) {
		            reverse = reverse + original.charAt(i);
		        }
		        System.out.println("reverse is:" +reverse);
		         
		        if(original.equals(reverse)) 
		            System.out.println("The number is palindrome");
		        else
		            System.out.println("The number is not a palindrome");
		         
		    }
	}


