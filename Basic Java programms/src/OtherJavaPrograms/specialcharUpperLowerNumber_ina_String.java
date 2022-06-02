package OtherJavaPrograms;
/*Program to find the found of special character, numbers, capital letter and small letter in a given string.*/

public class specialcharUpperLowerNumber_ina_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	String str =  "#GeeKs01fOr@gEEks07";
	int upper=0,number=0,lower=0,special=0;
	for(int i = 0;i<str.length();i++)
	{
		char ch = str.charAt(i);
		if(ch>'A' && ch < 'Z')
		{
			upper++;
		
		}
		else if(ch>'a' && ch < 'z')
		{
			lower++;
		}
		else if(ch>='0' && ch<='9')
		{
			number++;
		}
		else {
			special++;
		}
	}
		System.out.println("upper: "+upper);
		System.out.println("lower: "+lower);
		System.out.println("number: "+number);
		System.out.println("special: "+special);
	}

}
