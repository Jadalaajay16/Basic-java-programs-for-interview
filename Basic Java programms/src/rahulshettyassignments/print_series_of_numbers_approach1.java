package rahulshettyassignments;

import java.util.ArrayList;

/*+++++++++++++++++++++++
#Coding Exercise - 33
+++++++++++++++++++++++
create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} 
Note that the length of the array will be n*(n + 1)/2.
Ex1: Array(2)  [1, 1, 2]
Ex2: Array(3)  [1, 1, 2, 1, 2, 3]
Ex3: Array(4)  [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]*/

public class print_series_of_numbers_approach1 {

	public static void main(String[] args) {
		
	int n=4;
	int size = n * (n + 1) / 2;
	int[] array = new int[size];
	int counter = 0;
	int limit = 1;
	for (int i = 0; i < size; i++) 
	{
		array[i] = ++counter;
		if (counter == limit) 
			{
				counter = 0;
				limit++;
			}
	}
	
	
	
	for (int i = 0; i < size; i++)
	{
		System.out.print(array[i]+" , ");
		
	}
	
}}
