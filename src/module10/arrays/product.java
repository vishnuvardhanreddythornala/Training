//wajp to find product of all elements.

package module10.arrays;

public class product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,13,12,14,1,5,6,7};
		int product = 1;
		for(int i = 0; i<arr.length; i++) {
			product = product * arr[i];
			
		}
		System.out.println(product);

	}

}
