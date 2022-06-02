package Inheritance;

public class newgenengine extends parentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newgenengine a = new newgenengine();
		a.gear();
		a.brakes();
		a.engine();
		a.audiosystem(); //function overriding concept.We have this method in parent also.
		//and now created same method in child also.So overrides and fucntion in child will be executed.
	}

	public static void engine()
	{
		System.out.println("Engine is defined");
	}
	
	public static void audiosystem()
	{
		System.out.println("child audio is defined");
	}
}
