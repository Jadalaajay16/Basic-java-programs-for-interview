package OtherJavaPrograms;

/*
  How do you sort an array of 0 and 1?You are given an array of 0s and 1s in random order and you have to sort this
array i.e Segregate 0s on the left side and 1s on the right side of the array.*

Approach:
Maintain two indexes and Initialize the first index as 0 and second index n-1.
Now follow the following algorithm until left < right
a) Keep incrementing left index while there are 0s at it
b) Keep decrementing index right while there are 1s at it
c) Whenever left < right, exchange arr[left] and arr[right]
 * */

public class sort_array_of_zeros_ones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Segregate seg = new Segregate();
		int arr[] = new int[]{0, 1, 0, 1, 1, 1};
		int i, arr_size = arr.length;
		segregatearray(arr, arr_size);
		System.out.print("Array after segregation is ");
		for (i = 0; i < 6; i++)
		System.out.print(arr[i] + " ");
		
	}
	static void segregatearray(int arr[], int size)
	{
	int left = 0, right = size - 1;
	while (left < right)
	{
	while (arr[left] == 0 && left < right)
	left++;
	while (arr[right] == 1 && left < right)
	right--;
	if (left < right)
	{
	arr[left] = 0;
	arr[right] = 1;
	left++;
	right--;
	}
	}
	}

}
