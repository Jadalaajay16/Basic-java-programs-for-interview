package OtherJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class remove_duplicate_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="abcdefghijk";
		char b[]= a.toCharArray();

		
		/*This sol is not working
		  for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
				if(b[i]==(b[j]))
				{
					
					System.out.println("duplicate ele is:  "+b[i]);
				}
			}
		}
		
		*/
		Set set = new HashSet();

	      for(int i=0; i<b.length; i++)
	      {
	         if(!set.add(b[i]))
	         {
	            System.out.println("Index :: "+i+" character :: "+b[i]);
	         }
	         
	      }
	      System.out.println(set);
}}
