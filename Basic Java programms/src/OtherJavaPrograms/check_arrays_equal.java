package OtherJavaPrograms;

import java.util.Arrays;

public class check_arrays_equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,3,4};
		int b[]={1,2,3,4};
		
		//approach1-using arrays method
		
		if(Arrays.equals(a, b)){
			System.out.println("Arrays are equal");
		}
		else
		System.out.println("Arrays are not equal");
		
		//aproach2-without using arrays methods
		
		int a1[]= {1,2,3,4,6};
		int b1[]={1,2,3,4,5};
		boolean status=true;
		if(a1.length==b1.length) {
		//compare each individual ele in array
			for(int i=0;i<a1.length;i++) 
			{
				if(a1[i]!=b1[i])
				{
					status=false; //if any value doesnt equal to other value status boolean will change
				}
			}
		}
		else 
		{
			status=false;
			//System.out.println("Arrays are not equal");
		}
		
		
		//final condition
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
		
		
		
		
	}

}
