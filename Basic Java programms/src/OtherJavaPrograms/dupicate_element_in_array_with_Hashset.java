package OtherJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class dupicate_element_in_array_with_Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a[]= {"Java","Python","selenium","Java","Python"};
		Set<String> store = new HashSet<String>();
		boolean flag=false;
		for(String ele : a)
		{
			if(store.add(ele)==false) //when it cannot add into hashset,it becomes the dupliate
			{
				System.out.println("duplicate ele is:"+ele);
				flag=true;
			}
		}
		
		if(flag==true)
		{
			System.out.println("duplicate ele not found");
		}
	}

}
