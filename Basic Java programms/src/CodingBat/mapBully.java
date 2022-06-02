package CodingBat;
/*mapBully({"a": "candy", "b": "dirt"})  {"a": "", "b": "candy"}
mapBully({"a": "candy"})  {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"})  {"a": "", "b": "candy", "c": "meh"}*/

import java.util.HashMap;
import java.util.Map;

public class mapBully {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mapBully obj = new mapBully();
		Map<String,String> map= new HashMap<String,String>();
		
		  map.put("a","candy");
		  map.put("b","dirt");
		  System.out.println(map);
		  System.out.println(obj.mapBully(map));
		  
		
	}
	
	public Map<String, String> mapBully(Map<String, String> map) {
		  if (map.containsKey("a")) {
		    map.put("b", map.get("a"));
		    map.put("a", "");
		  }
		return map;

}}
