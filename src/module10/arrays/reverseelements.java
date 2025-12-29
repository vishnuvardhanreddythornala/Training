/*
 * Write a program to reverse each element (at the same index position).

	For Example:
	
	arr1 = {123, 456, 789};
	expected = {321, 654, 987};
 */

package module10.arrays;

public class reverseelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {123, 456, 789};
        int[] rev = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];   // temporary variable
            int reverse = 0;

            while (num != 0) {
                int digit = num % 10;
                reverse = reverse * 10 + digit;
                num = num / 10;
            }

            rev[i] = reverse;   // store at same index
        }

        // Print result
        for (int i = 0; i < rev.length; i++) {
            System.out.print(rev[i] + " ");
        }

	}

}
