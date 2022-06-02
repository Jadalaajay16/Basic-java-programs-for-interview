package stringprograms;

import java.util.ArrayList;
import java.util.Vector;

//input = "ABBDDCCCDBE"; should print AE
public class ADP_Interview_ABBDDCCCDBE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = "ABBDDCCCDBE";
		
		/*char[] arr =  input.toCharArray();
		for(int i=0;i<input.length();i++)
		{
			if(arr[i]==arr[i+1] && arr[i+1]==arr[i+2])
			{
				arr[i]=Character.valueOf(c);
			}
		}*/
		
		//Method 1: Using String builder
		StringBuilder input= new StringBuilder();
		String s = "ABBDDCCCDBE";
		input.append(s);
		
		int start = 0;
		
		while (start < input.length() - 2) {
			if (input.charAt(start) == input.charAt(start + 1) && input.charAt(start) == input.charAt(start + 2)) {
				input.deleteCharAt(start);
				input.deleteCharAt(start);
				input.deleteCharAt(start);
				start = 0;
				
			} else {
				start = start + 1;
			}

		}
		System.out.println(input.toString());
		
		//method 2: Using Arraylist
		
		String str = "ABBDDCCCDBE";
		char[] ch =str.toCharArray();
		ArrayList<Character> arr = new  ArrayList<Character>();
		for(int j=0;j<ch.length;j++)
		{
			arr.add(ch[j]);
		}
		System.out.println(arr.toString());
		
		 for (int i = 0; i < arr.size()-2; i++)
		 {
			 if(arr.get(i)==arr.get(i+1)&& arr.get(i+1)== arr.get(i+2))
			 {
				 arr.remove(i+2); 
				 arr.remove(i+1);
				 arr.remove(i);
				 i=-1;	//this is to reset i value in for loop after each removal of dupicate character 
			 }
			 
		 }
		 System.out.println(arr.toString());

}
}
