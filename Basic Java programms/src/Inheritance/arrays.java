package Inheritance;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		//Single array
		int b[] = {1,2,3,4};
		for(int i=0;i<4;i++) {
			System.out.println("single array"+b[i]);
		}
		
		//Finding min no from 2D array
		int a[][]= {{5,2,3},{4,2,0}};
		int min=a[0][0];
		for(int x=0;x<2;x++)
		{
			for(int y=0;y<3;y++)
			{
				if(min>a[x][y])
				{
					min = a[x][y];
				}
				//System.out.println(a[x][y]);
			}
		}
		System.out.println(min);
		
		
	}

}
