package stringprograms;

public class rev_strings_ina_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("My is Shriniwas Alle");
		String[] strA = str.split(" ");
		for (int i = strA.length-1; i >= 0; i--) {
		System.out.print(strA[i]);
		}
	}

}
