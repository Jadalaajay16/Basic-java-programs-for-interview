package collectionsframework;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WaysofCreatingHashMap {

	public static Map<String,Integer> marksmap; 
		// TODO Auto-generated method stub
		
		static
		{
			marksmap =  new HashMap<>();
			marksmap.put("A", 100);
			marksmap.put("B", 100);
		}
		
		public static void main(String[] args)
		{
		//1.using Hashmap class
		HashMap<String,Integer> map1 = new HashMap<>();
		Map<String,String> map2 = new HashMap<>();
		
		//2.Using static block-However this is not recommended
		System.out.println(WaysofCreatingHashMap.marksmap.get("A"));
		
		//3.Immutable Map with single entry
		Map<String,Integer> map3 = Collections.singletonMap("test", 200);
		System.out.println(map3.get("test"));
		//System.out.println(map3.put("abc",100)); This will give UnsupportedOperationException
		
		//4.JDK 8
		//Creating 2D array of strings using stream and collecting in the form of MAP
		Map<String,String> map4= Stream.of(new String[][]{
					{"Tom","A grade"},
					{"ajay","B grade"},
				}).collect(Collectors.toMap(data->data[0], data->data[1]));
		System.out.println(map4.get("Tom"));
				map4.put("Jadala", "A+grade");
				System.out.println(map4);
				
		//5.Using simple entry
				Map<String,String> map5= Stream.of(
						new AbstractMap.SimpleImmutableEntry<>("Ajay","Java"),
						new AbstractMap.SimpleImmutableEntry<>("jadala","python")
						).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
				System.out.println(map5);
			
		
	}
}

