package stringprograms;

public class ReverseStringPreserveSpace_Method2 {
/*
	op: a idnI evolI" from given string ''I love India" in
 */
	  public static void main(String[] args) {
	    String result=reverse("I love india");
	    System.out.println(result);
	    
	  }
	  public static String reverse(String s)
	  {
	    char[] ch=s.toCharArray();
	    int low=0;int high=ch.length-1;
	    while(low<high)
	    {
	      if(ch[low]==' ')
	      {
	        low++;
	      }
	      if(ch[high]==' ')
	      {
	        high--;
	      }
	      char c=ch[low];
	      ch[low]=ch[high];
	      ch[high]=c;
	      low++;
	      high--;
	    }
	    return s=String.valueOf(ch);
	    
	  }

	}