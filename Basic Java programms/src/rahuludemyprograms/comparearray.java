package rahuludemyprograms;

//compare same indexes of 2 different arrays and create new array for matchvalues
import java.util.ArrayList;

public class comparearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,4,5,7};
		int b[]= {6,4,3,7};
		//int c[]=new int[4];	//{4,7}
		ArrayList<Integer> al = new ArrayList<Integer>();
				
		for(int i=0;i<a.length;i++)
		{
				if(a[i]==b[i])
				{
					al.add(a[i]);
				}

		}
		
		Object[] c=al.toArray(); //to convert back into array
		for(Object ob : c)
		{
			System.out.println(ob);
		}
		//System.out.println(c);
}
}
