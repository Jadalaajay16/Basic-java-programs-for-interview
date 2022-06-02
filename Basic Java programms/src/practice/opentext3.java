package practice;

public class opentext3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		System.out.println(find_min(arr));
	}
	
	public static int find_min(int[] A) {
	    int ans = 0;
	    for (int i = 1; i < A.length; i++) {
	        if (ans > A[i]) {
	            ans = A[i];
	        }
	    }
	    return ans;
	}
	
	public int[] solution(int N) {
        // write your code in Java SE 8
		
    }

}
