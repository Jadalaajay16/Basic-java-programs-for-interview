package OtherJavaPrograms;

public class missing_number_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array should not contain duplicates,and it no need to be in sorted,and should be in proper range
		int a[]= {1,2,4,5};
		//1+2+3+4+5=15
		//1+2+4+5=12
		//missing no is 15-12
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);	
		
		int sum1=0;
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		System.out.println(sum1);
		
		System.out.println("missing number is:"+(sum1-sum));
	}

}
