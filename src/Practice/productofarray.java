//product of array
package Practice;
import java.util.Arrays;

public class productofarray {

	public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Step 1: Prefix products
        answer[0] = 1;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] * nums[i - 1];
        }

        // Step 2: Suffix products
        int suffixProduct = 1;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] = answer[i] * suffixProduct;
            suffixProduct = suffixProduct * nums[i];
        }

        return answer;
    }
		

	}

