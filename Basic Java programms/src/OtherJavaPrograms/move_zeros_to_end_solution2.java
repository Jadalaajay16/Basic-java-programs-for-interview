package OtherJavaPrograms;

/*source: https://www.w3resource.com/java-exercises/array/java-array-exercise-26.php */

public class move_zeros_to_end_solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {0,0,1,0,3,0,5,0,6};
        int i = 0;
		System.out.print("\nOriginal array: \n");
		for (int n : array_nums)
           System.out.print(n+"  ");
		for (int j=0;j < array_nums.length;j++)
		{
			if(array_nums[j]!= 0) 
			{
				int temp = array_nums[i]; 
	               array_nums[i] = array_nums[j];
	               array_nums[j] = temp;
	               i++;
			}
		}
		
		while (i < array_nums.length)// 0<9
		
			{
			array_nums[i]=0; 
			i++;
			//array_nums[i++] = 0;// above two steps and this single step is same
			}
		
			System.out.print("\nAfter moving 0's to the end of the array: \n");
	       for (int n : array_nums)
	           System.out.print(n+"  ");
				System.out.print("\n");
	}

}
