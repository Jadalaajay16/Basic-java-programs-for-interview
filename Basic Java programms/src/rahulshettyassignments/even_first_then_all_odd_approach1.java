package rahulshettyassignments;


/*Given an array A[], write a function that segregates even and odd numbers. The functions should put all even numbers first, and then odd numbers. 
Example: 
 

Input  = {12, 34, 45, 9, 8, 90, 3}
Output = {12, 34, 8, 90, 45, 9, 3}*/

public class even_first_then_all_odd_approach1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,10};

		int left = 0, right = arr.length - 1;
        while (left < right)
        {
            /* Increment left index while we see 0 at left */
            while (arr[left]%2 == 0 && left < right)
                left++;
 
            /* Decrement right index while we see 1 at right */
            while (arr[right]%2 == 1 && left < right)
                right--;
 
            if (left < right)
            {
                /* Swap arr[left] and arr[right]*/
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
		
	}
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]+" ");
}}
