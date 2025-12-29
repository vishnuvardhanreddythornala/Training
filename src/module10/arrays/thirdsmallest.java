//wajp to write third smallest element without sorting.
package module10.arrays;

public class thirdsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,13,2,15,6,4,23};
		int smallest = arr[0];
		int secondsmallest = arr[0];
		int thirdsmallest = arr[0];
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] < smallest) {
				secondsmallest = smallest;
				smallest = arr[i];
			}else if(arr[i] > smallest && arr[i] <secondsmallest) {
				thirdsmallest = secondsmallest;
				secondsmallest = arr[i];
			}else if(arr[i] > secondsmallest && arr[i] < thirdsmallest) {
				thirdsmallest = arr[i];
			}
		}
		System.out.println(thirdsmallest);

	}

}
