package CodingBat;

import java.util.HashMap;

/*Given an array of non-empty strings, return a Map<String, String> with a key for every different first 
 * character seen, with the value of all the strings starting with that character appended together in the order 
 * they appear in the array.


firstChar(["salt", "tea", "soda", "toast"])  {"s": "saltsoda", "t": "teatoast"}
firstChar(["aa", "bb", "cc", "aAA", "cCC", "d"])  {"a": "aaaAA", "b": "bb", "c": "cccCC", "d": "d"}
firstChar([])  {}*/

public class firstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"salt", "tea", "soda", "toast"};
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		for(String str : arr)
		{
			if(map.get(str.substring(0,1))!=null)
					{
				
					}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(map.size()!=0 && arr[i].substring(0, 1)!=map.get(i).charAt(i))
					
			{
				map.put(Character.toString(arr[i].charAt(i)), "saltsoda");
			}
			
		}
		System.out.println(map);
		
		//map.put("salt", "tea","soda","toast");
	}

}