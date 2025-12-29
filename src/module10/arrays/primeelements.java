//wajp to print prime elements for the given array.
package module10.arrays;

public class primeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i<arr.length; i++) {
			int count = 0;
			
			for(int j = 1; j<= arr.length; j++) {
				if(arr[i] % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.println(arr[i]	);
			}
		}

	}

}
