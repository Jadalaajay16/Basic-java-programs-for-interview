package rahuludemyprograms;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag =  false;
		int val=32;
		for (int i=2;i<val;i++)
		{
			if(val%2==0)
				{
					flag=true;
					break;
				}
		}
		if(flag)
			System.out.println(val + " This is not prime");
		else
			System.out.println(val + " This is a prime");
//method 2
		int no=10;
		int temp=0;
		for(int j=2;j<no;j++)
		{
			if(no%j==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
			System.out.println(no + " This is not prime");
		else
	
			System.out.println(no + " This is a prime");
		
		//print primenos below 100,This program needs to be checked and modified if necessary
		int tempo=0;
		for(int k=1;k<=100;k++)
		{
			
			for(int p=2;p<k-1;p++)
				
			{
				if(k%p==0)
				{
					tempo=tempo+1;
				}
			}
			if(tempo==0)
				
			{
				System.out.println(k);
			}
			else
				tempo=0;
		}
		//print 1st 20 prime numbers-SOMEINSSUE-NEEDTO BEFIXED
		int i=1,num=2;
		while(i<=20)
		{
			boolean b =true;
			for(int j=2;j<=num-1;j++)
			{
				if(num%j==0)
				{
					b = false;
					break;
				}
			}
			
			if(b==true)
			{
				System.out.println(num);
				
			}
			i++;
			num=num++;
			
		}
	}

}
