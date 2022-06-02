package OtherJavaPrograms;

public class linear_search {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int find=10; //we need to find index of this element
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==find)
			{
				System.out.println("Element is found at index :"+i);
				flag=true;
				break;
				
			}
		}
		if(flag==false)
		{
			System.out.println("Element is not there in array");
		}
		
	}

}
