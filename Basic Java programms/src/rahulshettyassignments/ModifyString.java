
package rahulshettyassignments;

//input=tomorrow

//Output=t$m$$rr$$$w

public class ModifyString  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "tomorrow";
		int count=0;
		int rep = 1;
		
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='o')
			{
				count=rep;
				while(count!=0)
				{
					System.out.print("$");
					count--;
				}
				rep++;	
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
			
		}
	}

}



