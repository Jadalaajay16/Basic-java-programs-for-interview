package stringprograms;

import java.util.HashMap;

/*Input-tomorrow
Output-ooorrtmw
*/
public class interview_question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "tomorrow";
		String output = "";
		//Create HashMap containing char as a key and occurrences as value
		HashMap<Character, Integer> charCountMap = new HashMap<Character,Integer>();
		//Converting given string to char array
		char[] ch= str.toCharArray();
		//Checking each char of strArray
		for(int i=0;i<str.length();i++)
		{
		if (charCountMap.containsKey(ch[i])) {
		// If char is present in charCountMap,
		// incrementing it's count by 1
		int count = charCountMap.get(ch[i]); //we are getting the count in hashmap here and increasing
		count++;
		charCountMap.replace(ch[i], count); //now replace that count with the increased count
			
		//charCountMap.put(ch, charCountMap.get(ch) + 1);
		} else {
		//If char is not present in charCountMap,
		//putting this char to charCountMap with 1 as it's value
		charCountMap.put(ch[i], 1);
		}
		}
		System.out.println(charCountMap);
		
		
		for (Character chat : charCountMap.keySet()) {
			System.out.println(charCountMap.get(chat));
			
		}
		
	
		for (Character cha : charCountMap.keySet()) {
			int max=charCountMap.get(cha);
			if(charCountMap.get(cha)>max)
			{
				max=charCountMap.get(cha);
			}
		    // do something with tab
			System.out.println("max is"+max);
		}
		
		
		
		/*for(int j=0;j<charCountMap.size();j++)
		{
			int max=charCountMap.get(j);
			if(charCountMap.ge)
		}*/

	}

}
