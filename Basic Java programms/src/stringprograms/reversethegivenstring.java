package stringprograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class reversethegivenstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "01230";
		// Using StringBulider
		System.out.println("using builder");
		StringBuilder str1 = new StringBuilder(str);
		System.out.println(str1.reverse());
		// Using StringBuffer
		System.out.println("using buffer");
		StringBuffer str2 = new StringBuffer(str);
		System.out.println(str2.reverse());
		// Using toCharArray method
		System.out.println("using toachararray");
		char[] strChar = str.toCharArray();
		for (int i = (str.length() - 1); i >= 0; i--) {
		System.out.print(strChar[i]);
		}
		// Using charAt() function
		for (int i = (str.length() - 1); i >= 0; i--) {
			//System.out.println("using charat");
			System.out.print(str.charAt(i));
		
		}
		// Using Collections
		
		char ch1[] = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();
		for (char ch : ch1) {
		list.add(ch);
		}
		Collections.reverse(list);
		ListIterator<Character> listIt = list.listIterator();
		System.out.println("-- Using ListIterator --");
		while (listIt.hasNext()) {
		System.out.print(listIt.next());
		
		}

	}

}
