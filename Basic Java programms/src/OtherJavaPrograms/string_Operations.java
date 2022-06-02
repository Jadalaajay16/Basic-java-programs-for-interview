package OtherJavaPrograms;

public class string_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "Hello";
		String s2=s.concat("World");
		System.out.println(s2); //out put will be HelloWorld
		
		
		String s3="hello",s4="hello";
		if(s3==s4)
		{
			System.out.println("equals operator will be executed as this is true");
		}
		else if(s3.equals(s4))
		{
			System.out.println("equals method will be executed");
		}
		
		//System.out.println(s3==s4);
		//System.out.println(s3.equals(s4));
		

	}

}
