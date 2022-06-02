package OtherJavaPrograms;

public class sum_of_digits_in_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=1234;
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum+rem;
			a=a/10;
			
		}
		System.out.println(sum);
	}

}
