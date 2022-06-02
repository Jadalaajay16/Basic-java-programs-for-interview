package rahulshettyassignments;

/*Given an array of ints, return true if the number of 1's is greater than the number of 4's
Ex1: [1, 4, 1]  true
Ex2: [1, 4, 1, 4]  false
Ex3: [1, 1]  true
Ex4: [1, 4, 4, 4]  false
Ex51: [1, 1, 1, 4]  true*/

public class ones_fours {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  a[] = {1, 1, 1, 4};
		
		int ones=0;
		int fours=0;
		for(int i=0;i<a.length;i++)
		{
			if (a[i]==1)
			{
				ones=ones+1;
			}
			else if(a[i]==4)
			{
				fours=fours+1;
			}
			
		}
		
		System.out.println("count of ones is : "+ones);
		System.out.println("count of fours is : "+fours);
		if(ones>fours){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}
