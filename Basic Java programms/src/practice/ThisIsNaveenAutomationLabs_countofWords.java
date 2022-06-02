package practice;

/*WAP - Java program
String a= "ThisIsCamelCase"
Write a program to find the number of words in this string. and print words with spaces in between them.
Expected output 4*/

public class ThisIsNaveenAutomationLabs_countofWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="ThisIsNaveenAutomationLabs";
		//Method 1-using regular expression
		System.out.println(s.replaceAll("[^A-Z]","").length());
		
		//Method 2
		int count = 0;
	    for (int i = 0; i < s.length(); i++) {
	        if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
	            count++;
	            
	            if(i!=0)
	            {
	            	 System.out.print(" ");
	            }
	            System.out.print(s.charAt(i));
	           
	        }
	        else {System.out.print(s.charAt(i));}
	       
	}
	    System.out.println("The count is : "+count);
	    
	    //Method 3
	    int count1 = 0;
	    try {
            for (char item : s.toCharArray())
                if (Character.isUpperCase(item))
                    count1++;
            System.out.println(count1);
        } catch (Exception e) {
            System.out.println("string is null");
        }
	    //Method 4
	    int count2 = 0;
	    for(int i=0; i<s.length(); i++) {
	     if(s.charAt(i) >= (char)65 && s.charAt(i) <= (char)90) //ascii values
	     {
	      count2++;
	     }
	    }
	    System.out.println(count2);
	    
	    //Method 5-using streams
	    long count3 = s.chars().filter(e->e>=65&&e<=95).count();
	    System.out.println(count3);
	    //method 6 - using streams
	    long count4=s.chars().filter(e->Character.isUpperCase(e)).count();
	    System.out.println(count4);
	    
	    //if small char word is at the beginning
	    String str=" thisIsNaveenAutomationLabs";
	    int counter5=0;
	    if(Character.isLowerCase(str.trim().charAt(0)))
	    {
	    	counter5++;
	    }
	    
	    for (int i = 0; i < str.length(); i++) 
	    {
	        if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') 
	        {
	            counter5++;
	        }
	       
	    }
	    System.out.println(counter5);
    }
	    
	    
}