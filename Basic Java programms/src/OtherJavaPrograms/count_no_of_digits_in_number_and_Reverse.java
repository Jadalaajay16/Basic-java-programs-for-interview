package OtherJavaPrograms;

public class count_no_of_digits_in_number_and_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1234567;
		int count=0,reverse=0;
		while(a!=0)
		{
			//for reversing number
			int remainder=a%10;
			reverse=reverse*10+remainder;
			//for counting no of digits
			a=a/10;
			count=count+1;
		
			
			
		}
		System.out.println("count is: " +count);
		System.out.println("rev number is: " +reverse);
	}

}
/*Iteration 1:

number = 1234
remainder = 1234 % 10 = 4
reverse = 0 * 10 + 4 = 0 + 4 = 4
number = 1234 / 10 = 123
Now the value of the number and reverse variable is 123 and 4, respectively.

Iteration 2:

number = 123
remainder = 123 % 10 = 3
reverse = 4 * 10 + 3 = 40 + 3 = 43
number = 123 / 10 = 12
Now the value of the number and reverse variable is 12 and 43, respectively.

Iteration 3:

number = 12
remainder = 12 % 10 = 2
reverse = 43 * 10 + 2 = 430 + 2 = 432
number = 12 / 10 = 1
Now the value of the number and reverse variable is 1 and 432, respectively.

Iteration 4:

number = 1
remainder = 1 % 10 = 1
reverse = 432 * 10 + 1 = 4320 + 1 = 4321
number = 1 / 10 = 0
Now the variable number become 0. Hence, we get the reverse number 4321.*/
