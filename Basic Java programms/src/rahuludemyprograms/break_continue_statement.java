package rahuludemyprograms;

public class break_continue_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//continue program
		for (int j=1; j<=10; j++)
		{			
			/* I have mentioned continue statement inside if condition where i is equal to 4
			 * if i value is equal to 4 then the control goes to continue statement and 
			 * the control jumps at the begining of for loop for next iteration without executing 
			 * print statement. 
			 * So, the output "Value of i is 4" wont display in the console. */
					
			if (j==4)
	        {
				continue;
	        }
			
	        System.out.println("Value of i is in continue program "+j);
		
		}
		//break program 1
		
		for (int i=1; i<=10; i++)
		{			
			if (i==4)
	        {
				break;
	        }
			
	        System.out.println("Value of i is in break program "+i);
		
		}
		//break program 2:IN case of innner loop it breaks just the inner loop
		for (int x=1; x<=4; x++)
		{			
			for (int y=1; y<=4; y++){
				
				if (x==2 && y==2)
		        {
					System.out.println("Value of x is "+x+" and Value of y is "+y);
					break;
		        }
				
				System.out.print(x);
		        System.out.println(y);
				
			}
	}

}
}
