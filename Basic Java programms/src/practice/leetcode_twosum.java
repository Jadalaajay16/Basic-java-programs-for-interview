package practice;


/*Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].*/

public class leetcode_twosum {

	public static void main(String[] args) {
		int[] nums = {3,2,4};    //{11,15,2,7};
	    int target=6;
		leetcode_twosum sum = new leetcode_twosum();
		sum.twoSum(nums, target);
		// TODO Auto-generated method stub
	
		
	}
	public int[] twoSum(int[] nums, int target) {
	;
	
	for(int i=0;i<nums.length-1;i++)
    {
       if(nums[i]+nums[i+1] == target)
       {
           //System.out.println( "(" + i + "," + ")" + i+1));
           System.out.print("(" + i + ",");
           System.out.print(i+1 + ")");
       }
    }
	return nums;
	}
}
