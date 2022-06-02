package practice;
/* Input-String s="x1y2z3"
Output- "xyyzzz"*/

public class x1y2z3_to_xyyzzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a  = "x1y2z3";
		String n ="";

		for(int i=0;i<=a.length()-1;i++)
		{
		String repchar= String.valueOf(a.charAt(i)); //x converting each char into string
		System.out.println(repchar); //x
		int count =Character.getNumericValue(a.charAt(i+1)); //1 converting next char into integer
		System.out.println(count);
			for(int j=0;j<=count-1;j++)
				{
					n=n+repchar;
				}
			i=i+1;
		}


		System.out.println(n);
}}
