package OtherJavaPrograms;

public class SecondHighestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1,14, 46, 47, 100, 94, 52, 86, 36, 94, 97 };
		int max=arr[0];
		int secondlargest = 0;
		
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>max)
			{
				//secondlargest=max;
				max=arr[i];
			}
			else if (arr[i]>secondlargest)
			{
				secondlargest=arr[i];
			}
		}
		
		System.out.println(secondlargest);
		System.out.println(max);
		
		}
	}


