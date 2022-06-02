package practice;
/*x^y
2^3 =8*/
public class powerOfANumber {
	public static void main(String[] args) {
		

		int num=3,pow=4; //2 4
		int result=1;//8
		while(pow>=1) //2 1
		{
			result =result*num; //2*2 4*2 
			pow--;
		}
		System.out.println(result);

	}

}
