package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Javastreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a= new ArrayList<String>();	
		a.add("zAjay");
		a.add("sJadala");
		a.add("is");
		a.add("great");
		a.add("programmer");
		a.add(2,"Aj");
		//System.out.println(a);
		
		//to print elements starts with letter "A".In general we have to use for loop
		a.stream().filter(s->s.startsWith("A")).forEachOrdered(s->System.out.println(s));
		System.out.println("*****to print count which starts with A");
		long c = a.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		//we use like below also directly creating a list instead of arraylist
		/*long d=Stream.of("Ajays","Is","A","Good","Progammer").filter(s->
		{
			s.endsWith("s");
		}).count();*/
		
		System.out.println("*****to print elemts of lenghth >4");
		a.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		System.out.println("*****to print elemts of lenghth >4 which limits only 1 element");
		a.stream().filter(s->s.length()>4).limit(1).forEachOrdered(s->System.out.println(s));
		
		System.out.println("*****to print elemts which contains a with uppercase");
		a.stream().filter(s->s.contains("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		System.out.println("*****to print elemts which contains a with uppercase and sorted");

		a.stream().filter(s->s.contains("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		
		System.out.println("*****Merging two lists");
		List<String> names =Arrays.asList("Ajay", "Anupam", "Prashanth", "CHOPPADANDI", "charan");
		
	    Stream<String> newstream =Stream.concat(names.stream(), a.stream());
	     
	    newstream.forEach(s->System.out.println(s));
	    
	    //boolean flag = newstream.anyMatch(s->s.equalsIgnoreCase("aj"));
	    //System.out.println(flag);
	    System.out.println("*****collect:convrt list into stream,do operations,convert back to list");
	    List<String> ls=a.stream().filter(s->s.contains("a")).sorted().map(s->s.toUpperCase()).collect(Collectors.toList());
	    System.out.println(ls.get(0));
		
	    
	    System.out.println("*****To remove duplicate numbers");
	    
	    List<Integer> dupl = Arrays.asList(1, 2, 1, 7);
	    dupl.stream().distinct().forEach(s->System.out.println(s));
		
	   
	}

}
