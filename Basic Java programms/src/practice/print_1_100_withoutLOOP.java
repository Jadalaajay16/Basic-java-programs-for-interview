package practice;

import java.util.Arrays;
import java.util.BitSet;
//Print 1 to 100 without using any loop
public class print_1_100_withoutLOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.using Arrays.fill
		Object num[] = new Object[100];
		Arrays.fill(num, new Object() {
			int count=0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		System.out.println(Arrays.toString(num));
		
		//2.using Bitset
		String set = new BitSet() {{set(1,101);}}.toString();
		System.out.append(set, 1, set.length());
	}

}
