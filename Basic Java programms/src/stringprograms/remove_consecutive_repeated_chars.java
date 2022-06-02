package stringprograms;

public class remove_consecutive_repeated_chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aabccbddcd";
		String op = "";
		char previous = ' ';
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=previous)
			{
				op=op+s.charAt(i);
				previous=s.charAt(i); //setting character to previous here
			}
		}
		System.out.println(op);
	}

}
