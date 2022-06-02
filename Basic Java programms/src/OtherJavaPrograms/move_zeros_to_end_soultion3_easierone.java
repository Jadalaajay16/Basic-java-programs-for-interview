package OtherJavaPrograms;

import java.util.Arrays;

public class move_zeros_to_end_soultion3_easierone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {0,0,1,0,3,0,5,0,6};
		int[] solarr = new int[array_nums.length];
		int cnt =0;
		for(int ele :array_nums )
		{
			if(ele!=0)
			{
				solarr[cnt]=ele;
				cnt++;
			}
		}
		System.out.print(Arrays.toString(solarr));
		
		
	}

}
