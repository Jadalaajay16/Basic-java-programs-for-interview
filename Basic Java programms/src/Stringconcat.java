import java.util.Scanner;

public class Stringconcat {

	public static void main(String[] args) {
		

		System.out.println("Enter two strings");
		Scanner sc= new Scanner(System.in);
		String s1= sc.nextLine();
		String s2= sc.nextLine();
		int l1=s1.length();
		int l2=s2.length();
		String s3=s1.concat(s2);
		//String s3=s1+s2; we can do this too
		s1=s1.toUpperCase();
		System.out.println("upper case is " + s1);
		
		System.out.println("the lengths are" + l1);
		System.out.println("the lengths are" + l2);
		
		System.out.println(s3);
		
		
		
	}

}
