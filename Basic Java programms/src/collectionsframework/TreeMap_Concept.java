package collectionsframework;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap_Concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap<Integer,String> treemap= new TreeMap<Integer,String>();
				treemap.put(2000, "Ajay");
				treemap.put(5000,"jadala");
				treemap.put(100,"a");
				treemap.put(6000,"B");
				System.out.println(treemap); //it will sort based on key(on alphabetic order if string,numeric order if interger) and print
				System.out.println(treemap.lastKey());
				System.out.println(treemap.firstKey());
				
				Set<Integer> keyslessthan5000 =  treemap.headMap(5000).keySet();
				System.out.println(keyslessthan5000);
				
				Set<Integer> keysgreaterthanequal5000 =  treemap.tailMap(5000).keySet();
				System.out.println(keysgreaterthanequal5000);
				
				//to print in rev order of sorted by keys
				TreeMap<Integer,String> treemap1= new TreeMap<Integer,String>(Comparator.reverseOrder());
				treemap1.put(2000, "Ajay");
				treemap1.put(5000,"jadala");
				treemap1.put(100,"a");
				treemap1.put(6000,"B");
				System.out.println(treemap1);
				
	}

}
