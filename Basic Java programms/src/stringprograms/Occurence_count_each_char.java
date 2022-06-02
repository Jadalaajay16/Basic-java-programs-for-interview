package stringprograms;

import java.util.HashMap;

public class Occurence_count_each_char {

	public static void main(String[] args) {//a=2 x=5 y=3 -
		// TODO Auto-generated method stub
		String str = "aaaabbcccddddd@@ !!".toLowerCase();
		//Create HashMap containing char as a key and occurrences as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character,Integer>();
		//Converting given string to char array
		char[] chArr = str.toCharArray();
		//Checking each char of strArray
		for (char ch : chArr) {
		if (charCountMap.containsKey(ch)) {
		// If char is present in charCountMap,
		// incrementing it's count by 1
		int count = charCountMap.get(ch); //we are getting the count in hashmap here and increasing
		count++;
		charCountMap.replace(ch, count); //now replace that count with the increased count
			
		//charCountMap.put(ch, charCountMap.get(ch) + 1);
		} else {
		//If char is not present in charCountMap,
		//putting this char to charCountMap with 1 as it's value
		charCountMap.put(ch, 1);
		}
		}
		System.out.println(charCountMap);
		
		
		//To count no of words with HashMap
		String[] str1 = "This this is is done by Saket Saket".toLowerCase().split(" ");
		
		HashMap<String, Integer> map = new HashMap<String,Integer>();
		for(int i=0;i<str1.length;i++)
		{
			if (map.containsKey(str1[i]))
			{
				int count = map.get(str1[i]);
				count++;
				map.put(str1[i], count);
			}
			else 
			{
				map.put(str1[i], 1);
			}
		}
		System.out.println(map);
	}

}
