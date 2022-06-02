package rahuludemyprograms;

public class countnoofoccurancesofcharinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int count =countoccurance("aaajaaabc",'a');
		System.out.println(count);
	}

	public static int countoccurance(String word, char letter) {
		
		int count=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)==letter)
			{
				count=count+1;
			}
			
		}
		
		
		return count;
	}

}
