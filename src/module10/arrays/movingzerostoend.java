/*
 * 		Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.

		Note: You must do this in-place without making a copy of the array.

		Example 1 :
		Input:
			nums = [0,1,0,3,12]
		Output:
			[1,3,12,0,0]
			
		Example 2 :
		Input:
			nums = [0]
		Output:
			[0]
			
			
		Constraints :
		1 <= nums.length <= 10^4
		-2^31 <= nums[i] <= 2^31 - 1
	
 */
package module10.arrays;

public class movingzerostoend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pos = 0;
		int[] nums = {0,1,0,3,12};
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] != 0) {
				nums[pos] = nums[i];
				pos++;
			}
		}
		while(pos < nums.length) {
			nums[pos] = 0;
			pos++;
		}
		 
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");

        }
	}

}
