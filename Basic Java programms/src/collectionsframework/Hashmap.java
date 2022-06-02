package collectionsframework;

import java.util.ArrayList;

/*
1. HashMap
2. LinkedHashedMap
3. TreeMap*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "Hello");
		hm.put(1, "world");
		hm.put(2, "goodbye");
		hm.put(3, ""); //we can keep null values too.This wont happen in hashtable
		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println(hm.get(42)); //returns null as there is no such index
		System.out.println(hm.size());
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("adf"));
		
		//convert Hashmap into set then get key value pairs seperately
		
		//Use the keySet() method if you only want the keys, and use the values() method if you only want the values:
		for (int i : hm.keySet()) {
			  System.out.println(i);
			}
		
		for (String j : hm.values()) {
			  System.out.println(j);
			}
		
		// Print keys and values
		for (int k : hm.keySet()) {
		  System.out.println("key: " + k + " value: " + hm.get(k));
		}
		
		for(Map.Entry<Integer, String> entry : hm.entrySet())
		{
			System.out.println(entry.getKey() +" "+ entry.getValue());
		}
		
		Iterator it =  hm.entrySet().iterator();
		/*Set sn = hm.entrySet();   we can use these two steps or above single step
		Iterator it = sn.iterator();*/
		while(it.hasNext())
		{
			System.out.println(it.next()); 
			Map.Entry pairs = (Map.Entry) it.next();
			System.out.println(pairs.getKey());
			System.out.println(pairs.getValue());
			
		}
		
		//iterate using java 8 for each and lambda
		hm.forEach((k,v)->System.out.println( "key is "+ k + "value is "+ v));
			
		//Convert hashmap keys or values into Arraylist
		
		List<Integer> lst = new ArrayList<Integer>(hm.keySet()); //sameway we do do for values also
		System.out.println(lst);
		
		
		
	}

}
