package rahulshettyassignments;



/*+++++++++++++++++++++++
Return the number of times that the string "code" appears anywhere in the given strings. 
Ex1: ("aaacodebbb")  1
Ex2: ("codexxcode")  2
Ex3: ("codexxcodexxcode")  3*/
import java.util.Scanner;
public class practice20924 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = a.next();
		System.out.println(s.split("code").length-1);
		//s.split(regex, limit)
		
	}
}
