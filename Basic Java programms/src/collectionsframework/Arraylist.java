package collectionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Arraylist {

	public static void main(String[] args) {
		//We can add/delete elements by dynamically where as its not possible with arrays
		
		ArrayList<String> a= new ArrayList<String>();
		ArrayList<Integer> arrlist = new ArrayList<Integer>(5); //we can create with capacity also like this
		System.out.println(arrlist);
		
		a.add("Ajay");
		a.add("Jadala");
		a.add("is");
		a.add("great");
		a.add("programmer");
		a.add("Ajay");
		a.add(2,"orAj");
		
		a.remove(4);
		
		//a.removeAll(a); removes all the elements in list
		//a.clear(); To remove all the elements in the ArrayList
		System.out.println(a);
		System.out.println(a.indexOf("Jadala"));
		System.out.println(a.indexOf("Notinlist"));//prints -1 if this is not in list
		System.out.println(a.lastIndexOf("Ajay")); //usefull when we want to get last index
		System.out.println(a.contains("is"));
		System.out.println(a.equals("Ajay"));
		a.set(0, "Replaced"); //we can modify element with this method
		System.out.println("after replacement "+a);
		//a.clear(); //removes all elements
		
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.get(2)); //to get element at index
		System.out.println(a.subList(0, 2)); //toIndex is exclusive
		System.out.println(a.subList(0, 0)); // gives empty list
		
	//moving sublist of one Arraylist into another arraylist
		List<String> b = a.subList(1, 4);
		System.out.println("Now elements in b list are" + b);
		
		
		//Looping through arraylist to print the elements
		System.out.println("***for loop");
		for(int i=0;i<b.size();i++)
		{
			System.out.println(b.get(i));
		}
		
		
		//with for-each loop
		System.out.println("****while loop");
		Collections.sort(b); // Sort the elements
		for(String j : b)
		{
			System.out.println(j);
		}
		
		//we can loop through iterator too
		
		//before java jdk 1.5 generics was not allowed.Now allowed.
		
		//addAll
		System.out.println("*******combine both arraylists");
		ArrayList<String> l1= new ArrayList<String>();
		l1.add("11.first");
		l1.add("l1.second");
		l1.add("11.third");
		
		ArrayList<String> l2= new ArrayList<String>();
		l2.add("12.first");
		l2.add("l2.second");
		l2.add("12.third");
		
		l1.addAll(l2); //combines both arraylists
		
		for(int n=0;n<l1.size();n++)
		{
			System.out.println(l1.get(n));
		}
		System.out.println(l1);
		
		System.out.println("*******remove all");
		
		l1.removeAll(l2);
		
		for(int k=0;k<l1.size();k++)
		{
			System.out.println(l1.get(k));
		}
		
		//retain all give intesection elements
		
		System.out.println("*******retain all");
		l1.retainAll(l2);
		
		for(int k=0;k<l1.size();k++)
		{
			System.out.println(l1.get(k));
		}
		
		
		//to convert arrays into arraylist
		System.out.println("*******to convert arrays into arraylist");
		List<String> names =Arrays.asList("Ajay", "Jadala", "orAj", "is", "programmer");
		System.out.println(names);
		
		
		//removeif
		System.out.println("*******removeif demo");
		ArrayList<Integer> arlist =  new ArrayList<Integer>	(Arrays.asList(1,2,3,4,5,6,7));
		arlist.removeIf(num->num%2==0); //to print odd numbers
		System.out.println(arlist)	;
		
		
		
		
	}

}


