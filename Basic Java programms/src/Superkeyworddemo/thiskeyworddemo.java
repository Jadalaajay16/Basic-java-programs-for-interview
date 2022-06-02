package Superkeyworddemo;

public class thiskeyworddemo {
	
	int a =2; //class level variable or global variable

	public void getdata()
	{
		int a = 5; //local variable
		int b= a + this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
		
		//this keywords refers to current object and object scope lies in class level
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyworddemo demo = new thiskeyworddemo();
		demo.getdata();
	}

}
