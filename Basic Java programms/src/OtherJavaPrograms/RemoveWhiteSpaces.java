package OtherJavaPrograms;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Method 1
		
		/*String str1 = "Saket Saurav        is a QualityAna    list";
		  
        //1. Using replaceAll() Method
  
        String str2 = str1.replaceAll("\\s", "");
  
        System.out.println(str2);
  
           }*/
	//Method 2-We can use any method
	String str = "India     Is My    Country";  
	char[] strArray = str.toCharArray();  
    {StringBuffer stringBuffer = new StringBuffer();  
    for (int i = 0; i < strArray.length; i++) 
    {  
        if ((strArray[i] != ' ') && (strArray[i] != '\t')) 
        {  
            stringBuffer.append(strArray[i]);  
        }  
    }  
    String noSpaceStr2 = stringBuffer.toString();  
    System.out.println(noSpaceStr2);  
	
	}}}


