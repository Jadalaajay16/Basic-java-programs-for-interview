package Inheritance;

public class constructordemo {
	
	
	//default
	public constructordemo() 
	{
		//constructor will not return values
		//name of construcotr will be same as class name
		System.out.println("i am in constructor");
		System.out.println("i am in constructor demo");	
	}
	
	//parametrized constructor
	public constructordemo(int a,int b) 
	{
		
		System.out.println("i am in parametrized constructor");
		int c = a+ b;
		System.out.println(c); //we can print but we cant return anything in constructor
	}
	
	//parametrized constructor
	public constructordemo(String str) 
	{
		
		System.out.println(str);
	}
	
	public void getdata() 
	{
		System.out.println("i am in getdata");

	}

	public static void main(String[] args)
	{
		
		constructordemo a =  new constructordemo();	
		a.getClass();
		
		constructordemo b =  new constructordemo(4,5);
		
		constructordemo c =  new constructordemo("Hello");
		
		
		
		
		//whenever you create an object constructor will be called first
		//constructor is used for intiatlising variables,objects
		//if you dont define constructor compiler will call implicit/inbuild constrctor
	

	}
}
