package stringprograms;

public class count_char_occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java is java again java again".toLowerCase();
		int len = str.length() - str.replace("j", "").length();
		System.out.println(len);
		//Output: Count of character 'a': 10
		
		//Method 2: Using for loop
		int charCount = 0;
		for(int i =0 ; i<str.length(); i++){
		if(str.charAt(i) == 'a'){
		charCount++;
		}
		
		}
		System.out.println(charCount);
		
		//Method 3 : Using for each
		charCount = 0;
		for(char ch: str.toCharArray()){
		if(ch == 'a'){
		charCount++;
		}
		}
		System.out.println(charCount);
	}

}
