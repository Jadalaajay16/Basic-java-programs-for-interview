package practice;


public class remove_Integers_numbers_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 Input: Test123test2
		 OP: Testtest
		 */

		String s = "Test123test2";
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(!Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]);
			}
		
		}
		System.out.println("**************");
		
		/*
		 Input: Test123test2
		 OP: 1232
		 */
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isDigit(ch[i]))
			{
				System.out.print(ch[i]);
				//count=count+ Integer.valueOf(ch[i]);
				count=count+Integer.parseInt(String.valueOf(ch[i]));
			}
		}
		System.out.println("count is :"+ count);
		
		//to sum all integers from string
		String str = "a3b4c6";
		int sum=0;
		int value  = Integer.parseInt(str.replaceAll("[^0-9]", ""));
		str = value+"";
		for(int j=0;j<str.length();j++)
		{
			sum=sum+ Integer.parseInt(String.valueOf(str.charAt(j)));
			
		}
		System.out.print("Sum is : "+sum);
	}

}
