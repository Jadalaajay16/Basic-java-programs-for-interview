package OtherJavaPrograms;

public class reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="ABCD";
		String rev="";
		
		//Approach 1 with Char at and Concatenation
		
		for(int i=a.length()-1;i>=0;i--)
		{
			rev=rev+a.charAt(i);
		}
		System.out.println(rev);
		
		//to check for palindrome
		if(a.equals(rev))
		{
			System.out.println(a+" is a palindrome");	
		}
		else
		{
			System.out.println(a+" is a not palindrome");	
		}
		
		
		//Approach 2 with Char Array and Concatenation
		
		String st="EFGH";
		String reve="";
		char b[]=st.toCharArray();
		for(int i=b.length-1;i>=0;i--)
		{
			reve=reve+b[i];
		}
		System.out.println(reve);
		
		
		//Approach 3 with String Buffer
		
		String str="IJKL";
		//String rever="";
		StringBuffer c = new StringBuffer(str);
		StringBuffer rever=c.reverse();
		System.out.println(rever);
		
	}

}
