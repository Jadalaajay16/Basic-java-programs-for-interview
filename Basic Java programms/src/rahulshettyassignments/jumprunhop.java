package rahulshettyassignments;


/*

Ask user to input length of an array, for example start=1 and end=5
1: Construct an array of 4 elements i.e. 1,2,3,4 
2: Return a new String[] array as stated above, except 
  a: for multiples of 3, use "JUMP" instead of the number 3, 
  b: for multiples of 5  "RUN", 
  c: for multiples of both 3 and 5 use "HOP". 
Ex1: (1, 2)  ["1"]
Ex2: (1, 3)  ["1", "2"]
Ex3: (1, 4)  ["1", "2", "JUMP" ]
Ex4: (1, 5)  ["1", "2", "JUMP", "4" ]
Ex5: (1, 6)  ["1", "2", "JUMP", "4", "RUN"]
Ex6: (1, 8)  ["1", "2", "JUMP", "4", "RUN", "JUMP", "7"]
Ex7: (1, 11)  ["1", "2", "JUMP", "4", "RUN", "JUMP", "7", "8", "JUMP", "RUN"]
Ex8: (1, 16)  ["1", "2", "JUMP", "4", "RUN", "JUMP", "7", "8", "JUMP", "RUN", "11", "JUMP", "13" , "14", "HOP"]
*/
import java.util.ArrayList;
public class jumprunhop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		
		int start=1;
		int end=16;
		
		for(int i=start;i<end;i++)
		{
			if(i%3!=0 && i%5!=0)
			{
				a.add(String.valueOf(i));
			}
			else if(i%3==0 && i%5==0)
			{
				a.add("HOP");
			}
			else if(i%3==0 && i%5!=0)
			{
				a.add("JUMP");
			}
			else if(i%5==0 && i%3!=0)
			{
				a.add("RUN");
			}
			
		}
	System.out.println(a);
		
	}

}
