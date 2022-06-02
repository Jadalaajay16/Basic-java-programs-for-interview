package rahulshettyassignments;
/*
 Return the number of clumps in the given arrays.
A "clump" in an array is a series of 2 or more adjacent elements of the same value. 
Ex1: clumps([1, 2, 2, 3, 4, 4])  2
Ex2: clumps([1, 1, 2, 1, 1])  2
Ex3: clumps([1, 1, 1, 1, 1])  1
Ex4: clumps([3, 4, 4, 4, 5])  1
Ex5: clumps([8, 8, 6, 6, 5, 5])  3
Ex6: clumps([10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1])  4*/

/*1.Traverse through the array and check for any occurrence of same element on two consecutive indices.
2.For any such occurrence, loop until a different number occurs.
3.Increase the count of clumps by 1 only after execution of step 2. If the entire array isn’t traversed yet, repeat the above steps for the following elements.
4.Print the final count of clumps after entire array traversal.*/



import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class count_series_of_num {

	public static void main(String[] args) {

		//int a[]={1,2,2,5,3,3};
        int a[]={10, 9, 8, 7, 6, 6, 5, 4, 4, 4, 3, 3, 3, 2, 2, 1};
        int count=0; // 1
        for(int i=0;i<a.length-1;i++)
        {
        	int flag=0;
        	while(i<a.length-1 && a[i]==a[i+1] )
        	{
        		flag=1;
        		i++;
        	}
        	if(flag==1)
        	{
        		count++;
        	}
        }
        System.out.println(count);               
	}

}
