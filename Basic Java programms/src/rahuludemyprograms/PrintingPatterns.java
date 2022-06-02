package rahuludemyprograms;

public class PrintingPatterns {

	public static void main(String[] args) {
		
		/* Printing pattern 1	2	3	4	
							5	6	7	
							8	9	
							10	*/

		
		int k=1;
		for(int i=0;i<4;i++) //(outer for loop) this block will loop for 4 times
		{
		//System.out.println( "outer loop started");
		for(int j=1;j<=4-i;j++) // inner loop
		{
		System.out.print( k);
		System.out.print("\t");
		k++;
		}
		System.out.println( "");
		}
		
		System.out.println( "Lets start another pattern");
		
		/* Printing pattern 
		  1
		  2 3 
		  4 5 6
		  7 8 9 10
		  
		  	*/
		int l=1;
		int a;
		for(a=1;a<5;a++)
		{
			//System.out.print("outer");
			for(int b=1;b<=a;b++)
			{
				
				System.out.print(l);
				System.out.print("\t");
				l++;
			}
			System.out.println( "");
		}
		
		System.out.println( "Lets start another pattern");
		
		/*
		Printing below pattern
		1 
		1 2
		1 2 3
		1 2 3 4
		*/
		
		int c;
		for(c=1;c<5;c++)
		{
			int m=1;
			//System.out.print("outer");
			for(int d=1;d<=c;d++)
			{
				System.out.print(m);
				System.out.print("\t");
				m++;
			}
			System.out.println( "");
		}
		
		/*Or we can do like below also without m variable*/
		
		System.out.println( "Lets try above in another method");
		
		int e;
		for(e=1;e<5;e++)
		{
			//int m=1;
			//System.out.print("outer");
			for(int f=1;f<=e;f++)
			{
				System.out.print(f);
				System.out.print("\t");
				//m++;
			}
			System.out.println( "");
		}
		
		System.out.println( "Lets start another pattern");
		
			/* print	3 
						6 9
						12 15 18 */
		
		
	}

}
