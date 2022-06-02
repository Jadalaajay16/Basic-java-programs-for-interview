package CodingBat;

import java.util.HashMap;

/*Modify and return the given map as follows: for this problem the map may or may not contain the "a" and "b" keys.
 *  If both keys are present, append their 2 string values together and store the result under the key "ab".


mapAB({"a": "Hi", "b": "There"})  {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"})  {"a": "Hi"}
mapAB({"b": "There"})  {"b": "There"}*/
public class mapAB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("a", "hi");
		map.put("b", "there");
		if(map.containsKey("a") && map.containsKey("b"))
		{
			map.put("ab", map.get("a")+map.get("b"));
		}
		System.out.println(map);
	}

}
