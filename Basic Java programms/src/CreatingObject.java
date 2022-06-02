
public class CreatingObject {
	int b=5;

	/*public static void hey(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=5;
		int c=a+b;
		System.out.println(c);
			}
	*/
	public void getdata() 
	{
		System.out.println("Get data");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CreatingObject a = new CreatingObject();
		a.getdata();
		System.out.println("Inside call");
		System.out.println(a.b); //calling class variable into another method.Basically are encapsulating
		CreatingObject1 c = new CreatingObject1();
		c.setdata(); //calling setdata from other class CreatingObject1 into here
	}

}


/*public class AddTwoNumbers {

	   public static void main(String[] args) {
	        
	      int num1 = 5, num2 = 15, sum;
	      sum = num1 + num2;

	      System.out.println("Sum of these numbers: "+sum);
	   }
	}*/