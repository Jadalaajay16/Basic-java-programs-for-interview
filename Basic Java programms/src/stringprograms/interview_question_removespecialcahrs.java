
package stringprograms;

//for string hjgi@#757hgo&^ return only alphabets

public class interview_question_removespecialcahrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "@#&Selenium@##";//"hjgi@#757hgo&^";
		
		//method 1 -  using regular expression
		String s = word.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		
		//Method 2 - using isalphabetic method
		String alp = "";
		char[] ch = word.toCharArray();
		int count=0;
		for (int i=ch.length-1;i>0;i--)
		{
			
			
			if(Character.isAlphabetic(ch[i]))
			{
			alp=ch[i]+alp;
			count=count+1;
			}
		}

		System.out.println(alp);
		System.out.println("count of special chars: "+count);
	}


}
