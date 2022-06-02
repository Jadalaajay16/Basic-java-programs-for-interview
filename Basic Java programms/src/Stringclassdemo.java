
public class Stringclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello"; //string literal
		String b = "Hello"; 

		String ab = new String("   Hello-there"); //with string class
		String ac = new String("Hello");
		System.out.println(ab.charAt(4));
		System.out.println(ab.indexOf("e"));
		System.out.println(ab.indexOf("j")); //if there is nothing it will print -1
		System.out.println(ab.substring(1,4));
		System.out.println(ab.substring(2)); //we defined only start index.End index is not defined.It assumes that till end of string.
		System.out.println(ab.concat("World"));
		System.out.println(ab.length());
		System.out.println(ab.trim()); //removes the whitespaces
		System.out.println(ab.toUpperCase());
		System.out.println(ab.toLowerCase());
		System.out.println(ab.replace("-","/"));
				//split
		
		 String arr[]=ab.trim().split("-");
		 
	
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//Reverse a string and check if is palindrome
		
		String s = "12345";
		String e = "";
		for(int i=s.length()-1;i>=0;i--)
				{
					e= e + s.charAt(i);
				}
		System.out.println(e);
		
		System.out.println(s.equals(e)); //this checks if it is a palindrome
		//or we use if too
		if(s==e)
		{
			System.out.println("its a palindrome");
		}
		else
		{
			System.out.println("its not a palindrome");
		}
		
		//LOOPS CONCEPTS
		int i;
		for(i=1;i<=10;i++) //dont keep ; after for loop line,it will terminate here only.Ex.output willbe 11 if we keep
		{
			System.out.println(i);	
		}
		System.out.println("\n");	
		
		
		i=0;
		while(i<5)
		{
			System.out.println(i);
			i++;
			
		}
		
		
	
		
		
		
		
		int j=20;
		do // one loop of execution is gurantee in do while
		{
			System.out.println(j); 
			j++;
		}
		
		while(j<25); //in do wile we have to keep ; at while
		{
			
		}
			
		
		
		/* Program to print pyramid of numbers
		1 2 3 4
		5 6 7
		8 9
		10 */
		
/*		
		int k=1;
		for(i=0;i<4;i++)
		{
			//System.out.println(i);
			for(j=1;j<=4-i;j++)
			{
				System.out.print(k);
				System.out.print("\t");
				k++;
			}
			System.out.print(" ");
		}
		
		
		*/
	
		
}
}
