/*
 * 105.given an array of integers, find and print all the leaders of the array. A leader is defined as an element of the array whihc is grater 
than all the elements following it.The right most elements is always a leader.
example
in the array {8,7,4,3,5,2}, leaders are 8,7,5 and 2
explanation:
8>7, 8>4, , ..8>2
7>4,..,7>2
5>2
2 is right most element.
 */
package module10.arrays;

public class leaderinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,7,4,3,5,2};
		int right = arr[arr.length - 1];
		System.out.print(right+ " ");
		
		for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > right) {
                right = arr[i];
                System.out.print(right + " ");
            }
        }

	}

}
