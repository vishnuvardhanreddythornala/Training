package module1.conditionals;

public class MaxOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    

	        int[] nums = { 12, 34, 6 };

	        int max;

	        if (nums[0] >= nums[1] && nums[0] >= nums[2]) {
	            max = nums[0];
	        } else if (nums[1] >= nums[0] && nums[1] >= nums[2]) {
	            max = nums[1];
	        } else {
	            max = nums[2];
	        }

	        System.out.println("Maximum number is: " + max);

	}

}
