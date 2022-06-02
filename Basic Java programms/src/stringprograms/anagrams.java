package stringprograms;

import java.util.Arrays;

public class anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Ganesh".replaceAll("\\s", ""); //replaceAll("\\s","")-removes white spaces
		String str2 = "Nagesh".replaceAll("\\s", "");
		boolean flag = true;
		if (str1.length() != str2.length()) {
		flag = false;
		} else {
		char[] ch1 = str1.toLowerCase().toCharArray();
		char[] ch2 = str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		flag = Arrays.equals(ch1, ch2);
		}
		if (flag == true) {
		System.out.println("Strings are Anagram");
		} else {
		System.out.println("Strings are not Anagram");
		}
		
		
		//method 2-Best one
		
		String str11 = "Race";
	    String str22 = "Care";
	    
	    str11 = str11.toLowerCase();
	    str22 = str22.toLowerCase();

	    // check if length is same
	    if(str11.length() == str22.length()) {

	      // convert strings to char array
	      char[] charArray1 = str11.toCharArray();
	      char[] charArray2 = str22.toCharArray();
	      //sorting charArray1 without inbuilt sort method
	      char temp;
	      
	      for(int i=0;i<charArray1.length;i++)
	      {
	    	  for(int j=i+1;j<charArray1.length;j++)
	    	  {
	    		  if(charArray1[i]>charArray1[j])
	    		  {
	    			  temp=charArray1[i];
	    			  charArray1[i]=charArray1[j];
	    			  charArray1[j]=temp;
	    		  }
	    	  }
	      }
	      System.out.println(Arrays.toString(charArray1));
	      
	      // sort the char array
	      //Arrays.sort(charArray1);
	      Arrays.sort(charArray2);

	      // if sorted char arrays are same
	      // then the string is anagram
	      boolean result = Arrays.equals(charArray1, charArray2);

	      if(result) {
	        System.out.println(str11 + " and " + str22 + " are anagram.");
	      }
	      else {
	        System.out.println(str11 + " and " + str22 + " are not anagram.");
	      }
	    }
	    else {
	      System.out.println(str11 + " and " + str22 + " are not anagram.");
	    }
	}

}
