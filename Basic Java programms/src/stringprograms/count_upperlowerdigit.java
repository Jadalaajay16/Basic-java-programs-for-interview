package stringprograms;

public class count_upperlowerdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "My name is Shri & my email id is shrini123@gmail.com";
		int upperCase = 0;
		int lowerCase = 0;
		int digits = 0;
		int other = 0;
	
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch)) {
			upperCase++;
			} else if (Character.isLowerCase(ch)) {
			lowerCase++;
			} else if (Character.isDigit(ch)) {
			digits++;
			} else {
			other++;
			}
			}
			System.out.println("Upper case letters: " + upperCase);
			System.out.println("Lower case letters: " + lowerCase);
			System.out.println("Digits : " + digits);
			System.out.println("Other letters: " + other);
	}

}
