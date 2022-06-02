import java.util.HashMap;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String[] str= "i am jadala ajay".split(" "); //i a m j
		String str= "i am jadala ajay";   //yaja aladaj
		//char[] ch = str.toCharArray();
		//String[] array = str.split(" ");
		
		for(int i=str.length()-1;i>=0;i--)
		{
			
			System.out.print(str.charAt(i));
			
		}
	
		
		/*HashMap<Character,Integer> map = new HashMap<Character,Integer>(); 
		
		for(int i=0;i<ch.length;i++)
		{
			if (map.containsKey(ch[i]))
			{
				int count = map.get(ch[i]);
				count++;
				map.put(ch[i], count);
				//map.replace(key, value)
			}
			else
			{
				map.put(ch[i], 1);
			}
		}
		System.out.println(map);
		
	}*/
		System.out.print(20+70+"java");
		System.out.print("java"+20+70);

}}
