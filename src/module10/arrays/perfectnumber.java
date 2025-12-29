//wajp to print perfect(perfect number) elements from the given array .
package module10.arrays;

public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,28,4,8,6,10};
		for(int i = 0; i<arr.length; i++) {
			int sum = 0;
			
			for(int j = 1; j<arr[i] ; j++) {
				if(arr[i] % j == 0) {
					sum = sum+j;
				}
			}
			if(sum == arr[i] && arr[i] !=0) {
				System.out.println(arr[i]);
			}
		}
		
	}

}
