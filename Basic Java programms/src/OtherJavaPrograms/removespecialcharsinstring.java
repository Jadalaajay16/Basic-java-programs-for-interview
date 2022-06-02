package OtherJavaPrograms;

public class removespecialcharsinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="@#$%^&((()12345ajayJADAla";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);	
	}

}
