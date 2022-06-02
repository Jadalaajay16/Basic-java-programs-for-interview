package rahulshettyassignments;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*int a=4, 5,6,7
Int b=5, 90,31,44,20,32
Declare above array a and b
Create 3rd array c which would have data of a and b
In above question we can't use array list and sort method of collection. */

public class copyonearraytoanother {

	public static void main(String[] args) {
		
		int a[]= {4,5,6,7};
		int b[]= {5,90,31,44,20,32};
		int[] mergedArray = new int[a.length+b.length];    //resultant array  
		int c[]= {};
		
		//Arrays.sort(a);
		//Arrays.sort(b);
		int pos=0;
		for(int ele : a)
		{
			mergedArray[pos]=ele;
			pos++;	
		}
		
		for(int ele : b)
		{
			mergedArray[pos]=ele;
			pos++;	
		}
		
		System.out.println("The merged array is: "+Arrays.toString(mergedArray));

		
	}

}
