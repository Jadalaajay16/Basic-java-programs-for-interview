package rahulshettyassignments;

public class pairwhohavesumequalto7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if (a[i] + a[j]==7)
				{
					System.out.println(a[i]+" "+a[j]);
				}
				
				
			}
		}
	
		
	}

}
