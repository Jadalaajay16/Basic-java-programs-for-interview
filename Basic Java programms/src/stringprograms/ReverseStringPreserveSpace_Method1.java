package stringprograms;

public class ReverseStringPreserveSpace_Method1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="internship at geeks for geeks";
		System.out.println(str.length());
		char[] inputArray = str.toCharArray();
        char[] result = new char[inputArray.length];
 
        // Mark spaces in result
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }
 
        // Traverse input string from beginning
        // and put characters in result from end
        int j = result.length - 1;
        System.out.println(j);
        for (int i = 0; i < inputArray.length; i++) {
 
            // Ignore spaces in input string
            if (inputArray[i] != ' ') 
            {
 
                // ignore spaces in result.
                if (result[j] == ' ') 
                {
                    j--;
                }
                result[j] = inputArray[i];
                j--;
            }
        }
        System.out.println(String.valueOf(result));
	}

}
