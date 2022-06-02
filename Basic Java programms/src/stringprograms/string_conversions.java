package stringprograms;

public class string_conversions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Replace the character 'O' with 't' from 2nd word i.e World
		String input = "Hello World";
		String[] words = input.split(" ");
		String newWord = words[1].replace("o", "t");
		System.out.println(words[0] +" "+newWord);
		
		// It will replace all non digits from String
		String s1 = "helloThisIsA1234Sample";
		s1 = s1.replaceAll("\\D","");
		System.out.println("Only Number : "+s1);
		
		// It will replace all digits from String
		String s2 = "helloThisIsA1234Sample";
		s2 = s2.replaceAll("\\d","");
		System.out.println("Only String : "+s2);
		
		// Convert int to String
		int i = 100;
		String s3 = Integer.toString(i);
		// Convert String to int
		String str1 = "100";
		int i1 = Integer.parseInt(str1);
		// Convert String to int using valueOf
		int j = 1000;
		String str = String.valueOf(j);
	}

}
