/*
 * find the counts is elements of unsosrted integer array which are equal to the avg of all elements of that array.
ex:
input1 :[ 2,2,2,2,2]
opt : 5
solution = 2+2+2+2+2 = 10/5 == 2
it contain five 2 element

input2: [1,3,2,4,5]
opt: 1
sol: 1+3...= 15/5== 15/5 ==3
it contains 1 3 element
 */
package module10.arrays;

public class avgofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,2,2,2,2};
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
			
		}
		int avg = sum/arr.length;
		
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == avg) {
				count++;
			}
		}
		 System.out.println(count);
		

	}

}
