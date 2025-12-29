//wajp to print even elements form the given array.
package module10.arrays;

public class evennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		for(int i = 0; i<=arr.length; i++) {
			if(i % 2 == 0) {
				System.out.println("Even elements are: "+ i);
			}
		}

	}

}
