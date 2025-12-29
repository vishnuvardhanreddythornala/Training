//Write a program to find the smallest element in an array without sorting

package Practice;

public class smallestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {12,3,14,15,7,2,9} ;
		int n = arr.length;
		int smallest = arr[0];
		for(int i = 0; i < n ; i++) {
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}

}
