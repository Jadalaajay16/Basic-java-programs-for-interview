package collectionsframework;

import java.util.HashMap;
import java.util.HashSet;

public class comparehashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		map1.put(0, "A");
		map1.put(1, "B");
		map1.put(2, "C");
		
		HashMap<Integer,String> map2 = new HashMap<Integer,String>();
		map2.put(0, "A");
		map2.put(1, "B");
		map2.put(2, "C");
		
		HashMap<Integer,String> map3 = new HashMap<Integer,String>();
		map3.put(0, "A");
		map3.put(1, "B");
		map3.put(2, "C");
		map3.put(3, "D");
		System.out.println(map1.values().equals(map2.values())); //It is giving false.But why?
	
	
		//1.On basis of key-value use equals method
		System.out.println(map1.equals(map2)); //true
		System.out.println(map1.equals(map3)); //false
		
		//2.Compare Hashmap for keys
		
		System.out.println(map1.keySet().equals(map2.keySet()));//true
		
		//3.Findout extra keys
		 HashSet<Integer> se =  new HashSet<Integer>(map1.keySet()); // 0 1 2
		 se.addAll(map3.keySet()); // 0 1 2 3
		 se.removeAll(map1.keySet());
		 System.out.println(se);
		 
		 
		 
}
}