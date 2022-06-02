package stringprograms;

import java.util.Arrays;

public class reverse_eachword_insentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Shriniwas";
		String[] words = str.split(" ");
		System.out.println(Arrays.toString(words)); //to print splitted words we have to use for loop on words
		String reverseString = "";
		for (int i = 0; i < words.length; i++) 
		{
			String word = words[i]; //my name
			String reverseWord = ""; //ym eman
			for (int j = (word.length() - 1); j >= 0; j--) 
				{
					reverseWord = reverseWord + word.charAt(j);
				}
			reverseString = reverseString + reverseWord + " "; //ym + eman
		}
		
		System.out.println("Input : " + str);
		System.out.println("Output : " + reverseString);
	}

}
