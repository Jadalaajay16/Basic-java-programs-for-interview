package rahuludemyprograms;

public class Reverseastring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "length";
		int l= s.length();
		System.out.println(l);
		
		String j="";
		for(int i=l-1;i>=0;i--)
		{
			j= j + s.charAt(i);
			
		}
		
		System.out.println(j);
		
	}

}
