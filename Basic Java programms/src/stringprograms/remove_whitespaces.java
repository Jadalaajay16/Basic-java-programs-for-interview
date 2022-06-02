package stringprograms;

public class remove_whitespaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Using replaceAll method
		String str = "My name   is  Shriniwas Alle";
		String strWithoutSpace = str.replaceAll("\\s", "");
		System.out.println("Using replaceAll method : "+strWithoutSpace);

		
		// Without using replaceAll method
		String str2 = "My name is   Shriniwas Alle";
		char ch[] = str2.toCharArray();
		StringBuffer sB = new StringBuffer();
		for (int i = 0; i < ch.length; i++) 
		{
			
			if(ch[i] != ' ' && ch[i] != '\t') 
				{
					sB.append(ch[i]);
		
				}
		}
		System.out.println("Without using replaceAll method : "+sB);
	}

}
