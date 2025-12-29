/*
 * wajp to find count of elements which are divisible by k
		input:
		int n = 7
		int[] a=9,-13,-7,-8,18,10 
		int k = 18
		opt : 2
 */
package module10.arrays;

public class divisiblebyk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int[] a = {9,-13,-7,-8,18,10};
		int k = 18;
		int count = 0;
		for(int i = 0; i < a.length; i++) {
			if(k % a[i] == 0) {
				count++;
				
			}
		}
		System.out.println(count);

	}

}
