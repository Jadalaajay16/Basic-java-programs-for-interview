package rahulshettyassignments;

import java.util.Arrays;

/*#Coding Exercise - 25
+++++++++++++++++++++++
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array. 
Ex1: [10, 3, 5, 6]  7
Ex2: [7, 2, 10, 9]  8
Ex3: [2, 10, 7, 2]  8*/

public class diffbetweenmaxandmin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4,6};
		int min=a[0];
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			else if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("Min no is :"+min);
		System.out.println("max no is :"+max);
		System.out.println("Difference  is :"+ (max-min));
	
		//anothe approach- To be checked  if wokring or not
		
		/*int b[]= {1,2,3,4,6};
		
		  Arrays.sort(b);
		  System.out.println(Arrays.toString(b));
		  int diff = b[b.length - 1] - b[0];
		  System.out.println("The difference between largest and smallest no. of array is "+diff);
		 }*/

		
		
	}

}
