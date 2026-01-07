package ArraysPracticeProblems;

/*
 * Input:  [1, 0, 2, 0, 3, 4]
   Output: [1, 2, 3, 4, 0, 0]

 */
public class MoveZerosToEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1, 0, 2, 0, 3, 4};
		moveZeros(arr);
		for(int i = 0; i< arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

	}
	static void moveZeros(int[] arr) {
		int pos = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		for(int i = pos; i<arr.length; i++) {
			arr[i] =0;
			}
		
		}
	}


