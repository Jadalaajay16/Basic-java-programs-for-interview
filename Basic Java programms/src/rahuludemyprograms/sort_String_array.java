package rahuludemyprograms;

import java.util.Arrays;

public class sort_String_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String str11="race";
		String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"}; 
		//char[] charArray1 = str11.toCharArray();
		
	      //char[] charArray2 = str22.toCharArray();
	      String temp;
	      
	      for(int i=0;i<countries.length;i++)
	      {
	    	  for(int j=i+1;j<countries.length;j++)
	    	  {
	    		  if(countries[i].compareTo(countries[j])>0)
	    		  {
	    			  temp=countries[i];
	    			  countries[i]=countries[j];
	    			  countries[j]=temp;
	    		  }
	    	  }
	      }
	      System.out.println(Arrays.toString(countries));
	}

}
