package practice;


import java.util.HashSet;

public class distinctVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "selenium";
		//Method 1
		HashSet<Character> set = new HashSet<Character>();
		for(int i =0;i<s.length();i++)
		{
			//s.contains('a','b');
			if(s.charAt(i)=='a' || s.charAt(i)== 'e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u')
			{
				set.add(s.charAt(i));			
			}
			
					
		}
		System.out.println(set);
		System.out.println(set.size());
		
		//method 2
		
		int a = 0, e = 0, i = 0, o = 0, u = 0;
	    for (char ch : s.toLowerCase().toCharArray()) {
	        if (ch == 'a') {
	            a = 1;
	        } else if (ch == 'e') {
	            e = 1;
	        } else if (ch == 'i') {
	            i = 1;
	        } else if (ch == 'o') {
	            o = 1;
	        } else if (ch == 'u') {
	            u = 1;
	        }
	       
		
		
	}
	    System.out.println(a+e+i+o+u);
}}
