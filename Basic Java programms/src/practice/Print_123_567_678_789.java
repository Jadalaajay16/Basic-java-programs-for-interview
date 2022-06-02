package practice;
/*Array = {1,2,3,5,6,7,8,9}
Expected Output= 123,567,678,789

Consider array with continueous numbers and If any number is missing like here 4 is missing 
then in output it should not construct the set of numbers which should have 4.
Eg 234, 345 should not print as it required 4 and 4 is missing in this array.*/

public class Print_123_567_678_789 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,2,3,5,6,7,8,9};
		String op ="";
		for(int i=0;i<a.length-2;i++)
		{
			if(a[i]+1==a[i+1] && a[i+1]+1==a[i+2])
			{
				op=op+String.valueOf(a[i])+String.valueOf(a[i+1])+String.valueOf(a[i+2]);
				op=op+" ";
			}
		}
		System.out.println(op);
		
	}

}
