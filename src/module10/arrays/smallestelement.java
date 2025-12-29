//wajp to find smallest element without sorting.
package module10.arrays;

public class smallestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr= {23,12,2,14,56};
		
		int smallest = arr[0];
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
				
			}
			
		}
		System.out.println(smallest);
	}

}
