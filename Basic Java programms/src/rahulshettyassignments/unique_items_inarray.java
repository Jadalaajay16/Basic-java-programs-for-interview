package rahulshettyassignments;
/*
+++++++++++++++++++++++
#Coding Exercise - 38
+++++++++++++++++++++++
Write a Program to print non repeated or unique items in a given array.
Ex1: Input[1,2]       Output [1,2]
Ex2: Input[3,3,7]    Output [7]
Ex3: Input[8,1,1,8]     Output ["No unique Item"]
Ex4: Input[6,6,3,3,9]   Output [9]
*/
public class unique_items_inarray {

	public static void main(String[] args) {
		int a[]= {6,6,3,3,5,9};
		
		for(int i=0;i<a.length;i++)
		{
			int count=0; 
			for(int j=0;j<a.length;j++)
			{
				if (a[i]==a[j]&&i!=j)
				{
				count++;	
				}
			}
			if(count==0)
			{
			System.out.println(a[i]);
			}
		}
		
		}
		
	}


