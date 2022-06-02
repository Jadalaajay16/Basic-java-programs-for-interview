package rahuludemyprograms;

/* Method which accepts Array and
returns sum of all the elements in array*/

public class sum_of_elements_in_array {

	public static void main(String[] args) {
	
		int a[] = {1,2,3,4,5};	
		int sum = sumarray(a);
		System.out.println(sum);
	}
	
	public static int sumarray(int a[]) {
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
		sum=sum+a[i];
		}
		
		return sum;
	}
	

}
