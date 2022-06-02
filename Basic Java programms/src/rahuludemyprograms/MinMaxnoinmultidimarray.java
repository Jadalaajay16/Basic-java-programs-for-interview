package rahuludemyprograms;
//Find Max and MIn no from array
/*2 4 5
  3 4 7
  1 2 9*/
 

public class MinMaxnoinmultidimarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{2,4,5},{3,4,5},{1,2,0}};
		int max=a[0][0];
		int min=a[0][0];
		for(int i=0;i<a.length;i++) //traverse through rows
		{
			for(int j=0;j<a.length;j++) //traverse through columns
			{
				if(a[i][j]>max) //for max no
				{
					max=a[i][j];
				}
				if(a[i][j]<min) //for min no
				{
					min=a[i][j];
				}
			}
		}
		System.out.println(max);
		System.out.println(min);
		
		
		
	}

}
