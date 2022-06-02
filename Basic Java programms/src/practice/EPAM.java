package practice;

import java.util.Arrays;
import java.util.List;
//Return true if sum of pairs of two elements is odd.First check if N/2 is even or odd.
public class EPAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[]= {2,7,4,6,3,1};
		
		if (A.length%2==0)
		{
			int evenCount=0;
	        int oddCount=0;

	        for (int i = 0; i <A.length ; i++) {
	            if(A[i]%2==0)
	                evenCount++;
	            else
	                oddCount++;
	        }

	        int evenPairs = evenCount*oddCount;
	        
	        
	        System.out.println("Number of odd pairs: " + evenPairs);
	    }

			
		
		else {
			System.out.println("Size of N is odd,not satisfying requirements");
		}
		
		
		
	}

}
