package stringprograms;

public class count_vowels_consonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				String input = "How many vowels in the String" ;
				char[] letters = input.toCharArray();
				int count = 0;
				for (char c: letters) {
				switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				count++;
				break;
				default: // no count increment
				}
				}
				System.out.println("Number of vowels in String [" + input + "] is: " + count);
				
				//Method 2 :
				int vowels = 0;
				int consonants = 0;
				String in = "How many vowels in this String";
				for (int i = 0; i < in .length(); i++)
				{
				if( in.charAt(i) == 'a' || in.charAt(i) == 'A' || in.charAt(i) ==
				'e' || in.charAt(i) == 'E' || in.charAt(i) == 'i' || in.charAt(i)
				== 'I' || in.charAt(i) == 'O' || in.charAt(i) == 'O' ||
				in.charAt(i) == 'U' || in.charAt(i) == 'u')
				vowels++;
				else
				consonants++;
				}
				System.out.println("Vowels:" + count);
				System.out.println("consonants:" + count);
	}

}
