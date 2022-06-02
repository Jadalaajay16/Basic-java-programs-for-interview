package practice;
/*I/p selenium, o/p - s*l*n*u*
 * */

public class replacealternate_with_STAR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "selenium";
		
		replacealternate_with_STAR a= new replacealternate_with_STAR();
			
		System.out.println(a.replaceeveryalternateletter("selenium"));
		
		//or
		System.out.println(replaceeveryalternateletter("selenium"));//since we delcared static we can directly call it.

	}
	public static String replaceeveryalternateletter(String str)
	{
	
	for(int i =1;i<str.length();i=i+2)
	{
		
		 str= str.replace(str.charAt(i), '*') ;
		
	}
	return str;
	}
	

}
