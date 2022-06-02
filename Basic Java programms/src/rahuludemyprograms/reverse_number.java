package rahuludemyprograms;

//543 345
//543%10=3 
//543/10=54
//54%10=4
//54/10=5 like wise and they we need to combine these

public class reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int a=543;
		int reverse=0;
		
		while(a!=0)
		{
			int digit=a%10;
			reverse=digit+reverse*10; 3 + 0*10=3  next 4 + 3*10 = 34 next 5 + 34*10 = 345
			a=a/10;
			
		}
		
		System.out.println(reverse);
	}
	*/
		
		
	//By using Stringbuffer
	int c=123;
	StringBuffer b = new StringBuffer(String.valueOf(c));
	StringBuffer rev = b.reverse();

	System.out.println(rev);
	
	//By using StringBuilder
	int d=567;
	StringBuilder sb=new StringBuilder();
	sb.append(d);
	StringBuilder rever= sb.reverse();
	System.out.println(rever);
			
}
}
