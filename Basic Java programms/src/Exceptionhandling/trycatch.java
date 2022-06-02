package Exceptionhandling;

public class trycatch {
	
	
	//one try can be followed by multiple catch blocks
	//catch should be definitely followed by try
	//for each exception we can write a catch blcok
	//we can use try-finally also without catch
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=7;
		int c=0;
		try
		{
		 int k= b/c;
		 
		}
		
		catch(ArithmeticException et)
		{
			System.out.println("arithmetic exception is catched" + et);
		}
		
		catch(Exception e)
		{
			System.out.println("I catched the error1  "+e);
		}
		
		finally
		{
			//we can write browser close or for deletion of cookies
			System.out.println("This will be executed irrespective of any errors in the middle");
		}
		
		

		}

}
