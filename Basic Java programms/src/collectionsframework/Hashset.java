package collectionsframework;
/*
1. Hashset
2. LinkedHashSet
3. TreeSet*/



import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs = new HashSet<String>();
		hs.add("USA");
		hs.add("USA");
		hs.add("uk");
		hs.add("INDIA");
		hs.add("Japan");
		System.out.println(hs);
		hs.remove("USA");
		System.out.println(hs);
		System.out.println(hs.size());
		System.out.println(hs.isEmpty());
		System.out.println("***print using for each loop");
		for(String j :hs)
		{
			System.out.println(j);
		}
		
		//Iterator is a interface which helps to traverse thorugh all elemetns
		Iterator<String> i =hs.iterator();
		//System.out.println(i.next());
		//System.out.println(i.next());
		//System.out.println(i.next());
		System.out.println("***print using iterator");
		while(i.hasNext()) //prints all the elements
		{
			System.out.println(i.next()); 
		}
		
	}

}
