package practice;

import java.util.Arrays;

/*I/p i love java,o/p Java Love I*/

public class ilovejava_TO_JavaLoveI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s= "i love java";
			String newstring = "";
			String[] sarray= s.split(" ");
			
			System.out.println(s);
			 for(int i=sarray.length-1;i>=0;i--)
			 {
				 newstring+=(sarray[i].charAt(0)+"").toUpperCase()+sarray[i].substring(1)+" ";
			 }
			 System.out.println(newstring);
			 
			 
			
	}

}
