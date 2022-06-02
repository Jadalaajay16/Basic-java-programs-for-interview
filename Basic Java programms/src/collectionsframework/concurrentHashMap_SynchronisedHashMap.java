package collectionsframework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap_SynchronisedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Synchronised Hashmap-Threadsafe,slow,null key and multple null values allowed
		Map<String,String> map1 = new HashMap<String,String>();
		map1.put("1", "Ajay");
		map1.put("2", "jadala");
		System.out.println(Collections.synchronizedMap(map1));
		
		//2.ConcurrentHashMap(Most preferred)-threadsafe,fast,null key and values are not allowed.
		ConcurrentHashMap<String,String> conmap =  new ConcurrentHashMap<String,String>();
		conmap.put("A", "suresh");
		conmap.put("B", "Naresh");
		System.out.println(conmap);
	}

}
