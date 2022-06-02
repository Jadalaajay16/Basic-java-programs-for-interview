package rahulshettyassignments;

import java.util.Arrays;
public class leftshift {
 public static void main(String[] args) {
	 
  Object[] arr = { 6, 3,null, 2, 7, 1 };
    int length=arr.length;
    System.out.println(Arrays.toString(arr));
     Object first;
   int j;
   first = arr[0];
   for (j = 0; j < length-1; j++) {
    // Shift element of array by one
    arr[j] = arr[j + 1];
   }
   arr[j] = first;
   System.out.println(Arrays.toString(arr));
 }

}