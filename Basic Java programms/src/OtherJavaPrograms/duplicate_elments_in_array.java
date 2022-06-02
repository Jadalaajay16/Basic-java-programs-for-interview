package OtherJavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class duplicate_elments_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//METHOD 1 - String elements
		//take one ele and compare with other elements

		String a[]= {"Java","Python","selenium","Python","Java"}; 
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i].equals(a[j])) //or a[i]==a[j]
				{
					System.out.println("duplicate ele found and is :"+a[i]);
					flag=true;
				}
			}
		}		
		if(flag==false)
		{
			System.out.println("duplicate ele not found");
		}
		//METHOD 2 - INT Elements 
		//Initialize array   
        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};   
          
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]); 
	}		
}}}
