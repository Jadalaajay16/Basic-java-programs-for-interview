package practice;

public class basicconcepts {
	static int p;
	static double d;
	static char ch;
	static String str;
	static boolean bool;
	//final static int j; This is wrong.For final global variable we should initialise at the time of declaration only.
	//Final local variable we can initialise after declaration also

	public static void main(String[] args) {
		
		//if programmer not initialised global variables it will return default values based on data type
		//For local variable not default values-it will through compilation error.
		System.out.println(basicconcepts.p); //o
		System.out.println(basicconcepts.d); //0.0
		System.out.println(basicconcepts.ch); // blank
		System.out.println(basicconcepts.str); //null
		System.out.println(basicconcepts.bool);//false
		System.out.println(p); //we can call static varaible directly
		
		
		
		
		// TODO Auto-generated method stub
		System.out.println("HI"+10); //HI10
		System.out.println("HI"+1010); //HI1010
		System.out.println("HI"+(10+10)); //HI20
		System.out.println("HI"+true); //HItrue
		System.out.println("HI"+false); //HIfalse
		System.out.println("HI"+null); //HInull
		System.out.println("HI"+10.5); //HI10.5
		
		int a =10;
		a=20;
		System.out.println(a); //20 becoz a is re assigned
		a=10+20;
		System.out.println(a); //30
		System.out.println(a=100+10);//100 we can perform operations but we cannot create new variable inside print
		
		//int a=990; This gives compilation error as we cant create two variables with same name inside a method or block
		int A=990; //But this will work
		//int b = 10.5; gives compilation error
		//double a =10.5; gives error as we are declaring duplicate variable
		System.out.println(A);
		
		System.out.println(test(10, 10)); //we can call static member directly or by classname.member
		int e=10,f=20;
		System.out.println(basicconcepts.test(e, f)); //supplying values through variables not directly 
		
		
	}
	
	//method to demonstrate condition ? exp1:exp2    	
	//if condition true it will execute exp1 otherwise exp2
	static int test(int c,int d)
	{
		final int w; //For final global variable we should initialise at the time of declaration only.
		w=9999; 	//Final local variable we can initialise after declaration also
				
		System.out.println(w);
		return (c==d)? 2*(c+d):(c+d);
		
		
	}
	

}
