package stringprograms;

public class Occurence_count_each_char_withoutMap_soultion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Case 1: should print all count of each char 
		String s = "aaabbcccccaca".toLowerCase();
		for(char ch='a';ch<'z';ch++)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			
			if(count!=0)
			System.out.println(ch + " : " + count);
		}
			
		
		//case 2: should print char count only which are repeated
		String str = "aaabbcccccaca";
		 int i = 0;
	        int j = i+1;
	        int count = 1;
	         while(i <= str.length() && j < str.length())
	         {
	             if(str.charAt(i) == str.charAt(j))
	             {
	                 count++;
	                 j++;
	             }
	             else
	             {
	                 System.out.print(str.charAt(i));
	                 System.out.print(count);
	                 count = 1;
	                 i = j;
	                 j++;
	             }
	         }
	         System.out.print(str.charAt(i));
	         System.out.println(count);
		
	}

}
