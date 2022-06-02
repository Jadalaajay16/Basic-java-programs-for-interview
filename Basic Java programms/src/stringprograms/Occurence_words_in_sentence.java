package stringprograms;

import java.util.HashMap;

public class Occurence_words_in_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a boy";
		System.out.println(str);
		int count = 1;
		for (int i = 0; i < (str.length() - 1); i++) {
		if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ') {
		count++;
		}
		}
		System.out.println("No of words in a String: " + count);
		
		
		//To count no of words with HashMap
				String[] str1 = "This this is is done by Saket Saket".toLowerCase().split(" ");
				
				HashMap<String, Integer> map = new HashMap<String,Integer>();
				for(int i=0;i<str1.length;i++)
				{
					if (map.containsKey(str1[i]))
					{
						int count1 = map.get(str1[i]);
						count1++;
						map.put(str1[i], count1);
					}
					else 
					{
						map.put(str1[i], 1);
					}
				}
				System.out.println(map);
	}

}
