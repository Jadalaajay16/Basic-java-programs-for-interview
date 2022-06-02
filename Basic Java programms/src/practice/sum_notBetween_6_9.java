package practice;
/*int [] test = {1,2,2,4,6,8,9,0,6,9,1,5,6,1,2,8,9,3,4,5,6,9,1,2,6,1,3,9};
How can I get the sum only those number which are not in between 6 and 9 in the array.*/
public class sum_notBetween_6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] test = {1,2,2,4,6,8,9,0,6,9,1,5,6,1,2,8,9};
		int sum1=0;
		int sum2=0;
		for(int i=0;i<test.length;i++)
		{
			if(test[i]!=6)
			{
				sum1=sum1+test[i];
				
			}
			else
			{
				while(test[i]!=9)
				{
					i++;
				}
			}
		}
		System.out.println(sum1);
		/*for(int j=0;j<test.length;j++)
		{
				if(test[j]==6)
				{
					for(int k=1;k<test.length-1;k++)
					{
						if(test[k]==9)
						{
							j=k;
						}
					}
				}
		}*/
	}

}
