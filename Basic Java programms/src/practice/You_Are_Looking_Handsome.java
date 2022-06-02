package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Some one can provide solution for this program :
// Input : {"looking", "you", "handsome", "are"}
// Output should be : You are looking handsome*/
public class You_Are_Looking_Handsome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]= {"looking", "you", "handsome", "are"};
		List<String> list =Arrays.asList(a);
		
		String odd="",even="";
		for(int i=0;i<list.size();i++)
		{
			if(i%2!=0)
			{
				odd = odd + list.get(i)+" ";
			}
			else
			{
				even =  even + list.get(i)+ " ";
			}
		}
		System.out.println(odd +even);
		

	}

}
