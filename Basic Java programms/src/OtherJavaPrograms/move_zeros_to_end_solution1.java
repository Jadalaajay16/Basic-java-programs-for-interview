package OtherJavaPrograms;

/*Move all zeroes to end of array- Given an array of integers,Move the all zero's to end of the array. 
 * Push all the zero’s of a given array to the end of the array.
Example 1: INPUT: myArray={2,5,0,4,2,7,0,0,1,9,4} ---OUTPUT: myArray={2,5,4,2,7,1,9,4,0,0,0}*/

public class move_zeros_to_end_solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={2,5,0,4,2,7,0,0,1,9,4};
		int count=0;
		int n=a.length;
		for(int i = 0;i<n;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		
		while(count<n)
		{
			a[count++]=0;
		}
		
		for(int i = 0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
	}

}
