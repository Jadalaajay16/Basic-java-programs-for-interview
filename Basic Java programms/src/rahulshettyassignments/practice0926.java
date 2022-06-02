package rahulshettyassignments;


/*Given a string, compute a new string by moving the first char to come after the next two chars.
Repeat this process for each subsequent group of 3 chars.Ignore any group of fewer than 3 chars at the end.
Ex1: ("abc")  "bca"
Ex2: ("tca")  "cat"
Ex3: ("tcagdo")  "catdog"
Ex4: ("abcdef")  "bcaefd"*/

public class practice0926 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str ="123456789";
        String newStr="";
        while(str.length()>=1){
            if(str.length()<3){
                newStr= newStr+str;
                //System.out.println(newStr);
                break;
            }
            else{
                String temp = str.substring(0,3); // 123 456
                newStr=newStr+temp.substring(1)+temp.charAt(0); //23+1 + 56+1
                str=str.substring(3); // 456789 789
            }
        }
        System.out.println(newStr);
	}

}
