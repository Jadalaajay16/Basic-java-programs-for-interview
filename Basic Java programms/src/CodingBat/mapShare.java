package CodingBat;

import java.util.HashMap;

/*Modify and return the given map as follows: if the key "a" has a value, 
 * set the key "b" to have that same value. In all cases remove the key "c", 
 * leaving the rest of the map unchanged.
 * mapShare({"a": "aaa", "b": "bbb", "c": "ccc"})  {"a": "aaa", "b": "aaa"}
mapShare({"b": "xyz", "c": "ccc"})  {"b": "xyz"}
mapShare({"a": "aaa", "c": "meh", "d": "hi"})  {"a": "aaa", "b": "aaa", "d": "hi"}*/

public class mapShare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,String> map = new HashMap<String,String>();
		//map.put("a", "aaa");
		map.put("c", "meh");
		map.put("d", "hi");
		System.out.println(map);
		map.remove("c");
		if(map.containsKey("a")) // or if(map.get("a")!=null)
		{
			map.put("b", map.get("a"));
			
	
		}
		System.out.println(map);
				
			
	}

	
}
