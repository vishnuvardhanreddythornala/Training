package Practice;
import java.util.Arrays;
public class products1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4};
		int[] result = productexpect(nums);
		
		System.out.println(Arrays.toString(result));

	}
	public static int[] productexpect(int[] nums) {
		int n  = nums.length;
		int[] answer = new int[n];
		
		answer[0] = 1;
		for(int i = 1; i<n; i++) {
			answer[i] = answer[i-1] * nums[i-1]; 
		}
		int suffixproduct = 1;
		for(int i = n-1; i>=0; i--) {
			answer[i] = answer[i] * suffixproduct;
			suffixproduct = suffixproduct * nums[i];
		}
		return answer;
	}

}
