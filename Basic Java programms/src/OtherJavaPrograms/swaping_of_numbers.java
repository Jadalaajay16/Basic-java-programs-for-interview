package OtherJavaPrograms;

public class swaping_of_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100, y = 200;
		  
        System.out.println("Before Swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
  
        int temp = x;
        x = y;
        y = temp;
  
        System.out.println("After swap");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        
        
        System.out.println("*************without temp variable***********");
        int a = 10;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping:"
                           + " x = " + a + ", y = " + b);
    }
	}


