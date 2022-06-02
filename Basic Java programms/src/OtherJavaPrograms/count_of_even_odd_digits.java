package OtherJavaPrograms;

public class count_of_even_odd_digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=123456789;
		int even=0;
		int odd=0;
		while(a!=0)
		{
			a=a/10;
			if(a%2==0)
			{
				even++;
			}
			else
			{
				odd++;
			}
			//count=count+1;	
		}
		System.out.println(even);
		System.out.println(odd);
	}

}
