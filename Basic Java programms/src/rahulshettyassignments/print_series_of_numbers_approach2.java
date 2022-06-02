package rahulshettyassignments;

public class print_series_of_numbers_approach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		int[] result = new int[n * (n + 1) / 2];
		
		  int i = 0;
		
		  for (int j = 1; j <= n; ++j)
		  {
		
		    for (int k = 1; k <= j; ++k)
		    {
		    	 result[i++] = k;
		    }
			
		  }
		  // printing values in array
		  for (int l = 0; l < n * (n + 1) / 2; l++)
			{
				System.out.print(result[l]+" , ");
				
			}  
		  
		}
}
