package stringprograms;

import java.util.Arrays;
//Java Program to Sort String array in an Alphabetical Order
public class sort_String_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"firstname","lastname","gender","place","address"}; //op address firstname gender lastname place
		String temp;
		
		for(int i=0;i<str.length;i++)
		{
			for(int j=i+1;j<str.length;j++)
			{
				if(str[i].charAt(0) > str[j].charAt(0))
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
			
		}
		
		
		System.out.println(Arrays.toString(str));
		
	}

}
