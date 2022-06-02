package OtherJavaPrograms;

import java.util.Arrays;

public class missingnumbers_1to20_askedinIVYCOMPTECH {

	//https://www.youtube.com/watch?v=X8TjL8DOcmc this link explains logic in very will
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userarray[] = {1,2,7,12,15,8,20};
	     System.out.println(Arrays.toString(userarray));
	    System.out.println(userarray.length);
	   
	    int[] copyarray = new int[userarray[userarray.length-1]+1];
	    System.out.println(copyarray.length);
	    // Make b[i]=1 if i is present
	    // in the array
	   
	    for(int userdata : userarray)
	    {
	    	copyarray[userdata] = 1;
	    }
	   
	    System.out.println(Arrays.toString(copyarray));
	    // Print the indices where b[i]=0
	    for(int i = 0; i<copyarray.length; i++)
	    {
	        if (copyarray[i] == 0)
	        {
	            System.out.print(i + " ");
	        }
	    }
	}
	}


