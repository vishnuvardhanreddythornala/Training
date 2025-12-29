package module10.arrays;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,24,56,72,8,9};
		int largest = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
		}
		System.out.println(largest);

	}

}
