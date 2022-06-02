package rahuludemyprograms;

//https://tcsglobal.udemy.com/course/qa-automation-interview-questions/learn/lecture/19753170#questions

import java.util.ArrayList;

public class Printuniquenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,4,5,5,6,5,9,6,9,1};
		//a.length
		
		ArrayList<Integer> b = new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			int k=0; //this needs to be reset for everyloop thats y it is placed inside loop
			
			if(!b.contains(a[i]))
			{
				b.add(a[i]);
				k++;
				
				for(int j=i+1;j<a.length;j++)
				{
					if(a[i]==a[j])
					{
						k++;
					}
					   	
				}
				
				System.out.println(a[i] + "-"+ k + " times");
				//System.out.println(k);
				if(k==1)
					System.out.println("Unique number is " + k);
			}
			
		}
		
	

}
}