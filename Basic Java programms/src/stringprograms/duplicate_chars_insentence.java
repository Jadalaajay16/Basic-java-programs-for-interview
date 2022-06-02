package stringprograms;

public class duplicate_chars_insentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Gggreat responsibility";
		String strafterdupremoval = " ";
		  int cnt = 0;
		  char[] inp = str.toCharArray();
		  System.out.println("Duplicate Characters are:");
		  for (int i = 0; i < str.length(); i++) 
		  {
			  for (int j = i + 1; j < str.length(); j++) 
			  	{
				  if (inp[i] == inp[j]) 
				  	{
					  System.out.println(inp[j]);
					  
					  cnt++;
					  break;
				  	}
				  else {
					  
					  strafterdupremoval=strafterdupremoval+inp[i];
				  }
			  	}
		  }
		  System.out.println("duplicate char count is " +cnt);
		  
	}

}
