package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/*"eeessmmmskaaakkbd" op:bd
in the above string remove when three same charachers together then remove 
and do this until no duplicate of 3 characters together

Examples: BELOW CODE IS FAILING FOR BELOW INPUTS

Input : aabbbaccddddc
Output :ccdc

Input :aabbaccdddc
Output :aabbaccc
*/
public class aabbbaccddddc_nonrepeated_3letters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "aabbaccdddc";
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            if (map.containsKey(input.charAt(i))) {
                int temp = map.get(input.charAt(i)) + 1;
                map.put(input.charAt(i), temp);
            } else {
                map.put(input.charAt(i), 1);
            }
        }
        System.out.println(map);
        System.out.println("***********");
      
        map.keySet().stream().filter(k -> map.get(k)<3).forEach(e -> System.out.print(e));
        
        //The correct and working solution
        for(int i=0;i<input.length()-3;i++)
        {
          
          if((input.charAt(i)==input.charAt(i+1))&&(input.charAt(i+1)==input.charAt(i+2)))
          {
            
        	  input=input.substring(0,i)+input.substring(i+3);
        
        	  i=-1;
            }
                }
        System.out.println("Final String: "+input);
          
        }
	}


