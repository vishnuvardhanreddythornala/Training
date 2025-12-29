//second largest

package module10.arrays;

public class secondlargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr = {12,13,2,14,15,73,90,86};
		int largest = arr[0];
		int secondlargest = arr[0];
		for(int i = 0 ; i<arr.length; i++) {
			if(arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			}else if(arr[i] < largest && arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
			
		}
		System.out.println(secondlargest);

	}

}
