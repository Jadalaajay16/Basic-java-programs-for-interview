package collectionsframework;

import java.util.Iterator;
import java.util.LinkedList;


/*How the ArrayList works:
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. 
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works:
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a 
link to the next container in the list. To add an element to the list, 
the element is placed into a new container and that container is linked to one of the other containers in the list.

When To Use:
It is best to use an ArrayList when:

You want to access random items frequently
You only need to add or remove elements at the end of the list
It is best to use a LinkedList when:

You only use the list by looping through it instead of accessing random items
You frequently need to add and remove items from the beginning, middle or end of the
list


Method	Description	Try it
addFirst()	Adds an item to the beginning of the list.	
addLast()	Add an item to the end of the list	
removeFirst()	Remove an item from the beginning of the list.	
removeLast()	Remove an item from the end of the list	
getFirst()	Get the item at the beginning of the list	
getLast()	Get the item at the end of the list

*/

public class Linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Hello");
		ll.add("how");
		ll.add("are");
		ll.add("you");
		System.out.println(ll);
		
		//addfirst-we have this only here.Its not possible in arraylist
		ll.addFirst("Ajay");
		ll.addLast("Jadala");
		System.out.println(ll);
		
		//get
		System.out.println(ll.get(0));
		//set
		ll.set(0, "Jadala");
		System.out.println(ll);
		//removefirst/last-not available in array list
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		//remove
		ll.remove(2);
		//for loop
		
		System.out.println("******for loop");
		for(int i=0;i<ll.size();i++)
		{
			System.out.println(ll.get(i));
		}
		
		//for each
		System.out.println("****for each");
		for(String str : ll)
		{
			System.out.println(str);
		}
		
		//while
		System.out.println("******while");
		int num=0;
		while(ll.size()>num)
		{
			System.out.println(ll.get(num));
			num++;
		}
		
		//iterator
		System.out.println("***Iterator");
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("***Printing in rev order using Iterator");
		Iterator<String> itr = ll.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		
		
	}

}
