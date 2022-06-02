package ManasJhaPrograms;

public class find_the_contiguous_subarray {

	public static void main(int[] A) {
		// TODO Auto-generated method stub
		 int maxSoFar=A[0], maxEndingHere=A[0];
		    for (int i=1;i<A.length;++i){
		    	maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
		    	maxSoFar=Math.max(maxSoFar, maxEndingHere);	
		    }
		    System.out.print(maxSoFar);
	}

	//find_the_contiguous_subarray hey = new find_the_contiguous_subarray();
	
	
}

//find_the_contiguous_subarray hey = new find_the_contiguous_subarray();


