package practice;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class opentext2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "example";
		 
		  int N = str.length();
		  System.out.print(minCntCharDeletionsfrequency(str.toCharArray(), N));
	}
	
	static int minCntCharDeletionsfrequency(char[] str,int N)
{

HashMap<Character,Integer> mp =new HashMap<>();


PriorityQueue<Integer> pq =new PriorityQueue<>((x, y) ->Integer.compare(y, x));


int cntChar = 0;


for (int i = 0; i < N; i++)
{

if(mp.containsKey(str[i]))
{
mp.put(str[i],
mp.get(str[i]) + 1);
}
else
{
mp.put(str[i], 1);
}
}


for (Map.Entry<Character,Integer> it :
mp.entrySet())
{

pq.add(it.getValue());
}


while (!pq.isEmpty())
{

int frequent = pq.peek();


pq.remove();


if (pq.isEmpty()) {


return cntChar;
}


if (frequent == pq.peek())
{

if (frequent > 1)
{

pq.add(frequent - 1);
}


cntChar++;
}
}

return cntChar;
}

}
