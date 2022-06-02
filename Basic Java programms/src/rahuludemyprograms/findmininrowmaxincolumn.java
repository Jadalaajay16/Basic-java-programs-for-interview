package rahuludemyprograms;

public class findmininrowmaxincolumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 5 2 3
		 * 4 2 0
		 * 
		 */
		
		//Finding min no from 2D array
				int a[][]= {{5,2,3},{4,2,0}};
				int mincoloumn=0;
				int min=a[0][0];
				//int max=0;
				for(int x=0;x<2;x++)
				{
					for(int y=0;y<3;y++)
					{
						if(min>a[x][y])
						{
							min = a[x][y];
							mincoloumn=y;
							//x is the min row num here.In this row we have to find max in column
							
						}
						
						//System.out.println(a[x][y]);
					}
					
				}
				
				System.out.println("MIn no is " + min);
				
				int max=a[0][mincoloumn];
				int k = 0;
				while(k<2)
				{
				if(a[k][mincoloumn]>max)
				{
				max=a[k][mincoloumn];
				}
				k++;
				}

				System.out.println("max no from min col is " +max);
		
		
		
		
	}

}
