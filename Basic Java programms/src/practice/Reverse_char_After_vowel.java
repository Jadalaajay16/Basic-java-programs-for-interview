package practice;
/*Input string : this is rohit
Output string : thsi si rhoti*/

public class Reverse_char_After_vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="this is rohit";
		String op = "";
		char[] ch = s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(ch[i]=='a' || ch[i] == 'e'|| ch[i]=='i'|| ch[i]=='o'||ch[i]=='u')
			{
				op=op+ch[i+1]+ch[i];
				i++;
				
			}
			else
			{
				op=op+ch[i];
			}
		}
		System.out.println(op);
				
	}

}
