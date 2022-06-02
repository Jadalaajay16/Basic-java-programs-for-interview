package rahulshettyassignments;

public class even_first_then_all_odd_approach2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {22,3,2,5,8};
		
		//syntax: var-name = new type[size];
		int arr2[]= new int[arr.length];
		
		int firstitem = 0, lastitem = arr.length - 1;
		
		for(int i = 0; i < arr.length; i++)
        {
			if(arr[i]%2==0)
			{
				arr2[firstitem]=arr[i];
				firstitem++;
			}
			else
			{
				arr2[lastitem]=arr[i];
				lastitem--;
			}
			
        }
		
		for(int i = 0; i < arr2.length; i++)
        {
			System.out.print(arr2[i]+" ");
        }
		
		
	}

}
