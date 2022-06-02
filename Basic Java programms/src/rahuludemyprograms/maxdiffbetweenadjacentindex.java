package rahuludemyprograms;

public class maxdiffbetweenadjacentindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,4,8,15,17}; //3, 4, 7, 2 ans should be 7
		int dif=0;
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]-a[i-1]>dif)
			{
				dif=a[i]-a[i-1];
			}
			System.out.println(a[i]-a[i-1]); //prints  3 4 7 2
			
		}
		System.out.println("max number is :" +dif);
	}

}
