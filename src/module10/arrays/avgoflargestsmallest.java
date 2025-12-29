/*
 * Find the average of largest and smallest numbers in an unsorted integer array

Eg.

Input Case 1:

input: [1, 4, 3, 2]
output: 2.5

solution:
average = (1 + 4) / 2
=> 5 / 2
=> 2.5

input: [1, 4, 3, 4]
output: 3

solution:
average = (1 + 4 + 4) / 3
=> 9 / 3
=> 3
 */

package module10.arrays;

public class avgoflargestsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 4, 3, 4};
		int max = arr[0];
		int min = arr[0];
		float sum = 0;
		for(int i = 0; i < arr.length; i++) {
			 
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		int mincount = 0;
		int maxcount = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == max) {
				maxcount++;
			}
			if (arr[i] == min) {
                mincount++;
            }
		}
		int totalcount = mincount + maxcount;
		 sum = (max * maxcount) + (min * mincount);
		float avg = sum/totalcount;
		System.out.println(avg);

	}

}
