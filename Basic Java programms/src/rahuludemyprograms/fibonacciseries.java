package rahuludemyprograms;

public class fibonacciseries {

	public static void main(String[] args) {
		

		//0 1 1 2 3 5 8 13 21 34
		
		int a=0;
		int b=1;
		int sum;
		int i=1;
		System.out.println(a);
		System.out.println(b);
		while(i<9)
		{
			sum=a+b; 
			System.out.println(sum);
			a=b; //a 1 1 2
			b=sum;//b 1 2 3
			i++;
			
		}
	}

}
