package stringprograms;

public class Occurence_count_each_char_withoutMap_soultion1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "aaaabbcccddddd@@ !!j";
		
		for(int i=0;i<str.length();i++)
		{
			int count=1;
			while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
			{	
				count++;
				i++;
			}
			if(count==1)
			{
				System.out.print(str.charAt(i));
			}
			else {
				System.out.print(str.charAt(i));
				System.out.print(count);
			}
		}
	}

}
