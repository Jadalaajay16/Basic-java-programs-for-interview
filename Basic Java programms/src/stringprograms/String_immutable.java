package stringprograms;

public class String_immutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String SCP Immutable
		String str1 = "Shri";
		str1.concat("Alle");
		System.out.println(str1);
		
		// String object Immutable
		String str4 = new String("Hello");
		str4.concat("World");
		System.out.println(str4);
		
		// StringBuffer Mutable
		StringBuffer str2 = new StringBuffer("Shri");
		str2.append("Alle");
		System.out.println(str2);
		
		// StringBuilder Mutable
		StringBuilder str3 = new StringBuilder("Shriniwas");
		str3.append("Alle");
		System.out.println(str3);
	}

}
