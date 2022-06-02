package Inheritance;

public class Functionoverloading {

	public static void main(String[] args) {
		
		//function overloading-same method in class has same method name.
		//either argument count should be different or
		//argument data type should be different
		//realtime example: Bill payment with different payment methods.like creditcard,debitcard
		
		Functionoverloading load = new Functionoverloading();
		load.getData(5);
		load.getData("Hello");
		load.getData(2, 3);
		
		
	}
	
		public void getData(int a)
		{
		System.out.println(a);
		}
		public void getData(String a) //arg return type is diff here
		{
		System.out.println(a);
		}
		public void getData(int a,int b) //arg count is diff here
		{
		System.out.println(b);
		}
}		