package rahuludemyprograms;

/* Print 5 Multiplication without
using Multiply operator*/

public class multiplicationwithoutmultiplicationoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int result = multiply(5,10);
		System.out.println(result);
		
	}

	public static int multiply(int i,int j) {//2*5
		//i has to sum itself j times to get the result
		int k=1;
		int sum=0;
		while(k<=j)
		{
			sum=sum+i; //0+2 2+2 4+2 6+2 8+2
			k++;
		}
			
		return sum;
		
	}
}
