package Superkeyworddemo;

//demo on Super for variable,method and construtor

public class childclass extends parentclass {
	
	String name = "Jadala"; //if i comment this now we get Ajay two times in output
	
	public childclass()
	{	
		super(); //TO call parent constructor,this should be always in first line of this method
		System.out.println("child construtor");
		
	}
	
	
	public void stringname()
	{
	System.out.println(name);
	System.out.println(super.name); //if both parent and child has same variable/method name by keeping super keyword we can print them
	//super refers to parentclas
	}
	
	
	public void getdata()
	{
		super.getdata(); //accessing parent method with super keyword
		System.out.println("I am in child clss");
	}
			
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childclass c = new childclass();
		c.stringname();
		c.getdata();
	}

}
