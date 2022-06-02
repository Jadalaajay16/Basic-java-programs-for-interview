package practice;

import java.util.ArrayList;
import java.util.TreeMap;

public class opentext_codility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "zyzyzyz";
	     
	    System.out.println(smallestSubstring(S));
	}
	static int smallestSubstring(String a)
	{

    ArrayList<String> a1 = new ArrayList<>();
 
    
    for(int i = 0; i < a.length(); i++)
    {
        for(int j = i + 1; j <= a.length(); j++)
        {
             
            
            if (i != j)
             
               
                a1.add(a.substring(i, j));
        }
    }
 
    
    TreeMap<String, Integer> a2 = new TreeMap<>();
    for(String s : a1)
        a2.put(s, a2.getOrDefault(s, 0) + 1);
 
    ArrayList<String> freshlist = new ArrayList<>();
 
   
    for(String s : a2.keySet())
    {
         
       
        if (a2.get(s) == 1)
 
           
            freshlist.add(s);
    }
 
   
    TreeMap<String, Integer> dictionary = new TreeMap<>();
 
    for(String s : freshlist)
    {
         
        
        dictionary.put(s, s.length());
    }
 
    ArrayList<Integer> newlist = new ArrayList<>();
 
    
    for(String s : dictionary.keySet())
        newlist.add(dictionary.get(s));
 
    int ans = Integer.MAX_VALUE;
 
    for(int i : newlist)
        ans = Math.min(ans, i);
 
    
    return ans == Integer.MAX_VALUE ? 0 : ans;
}

}
