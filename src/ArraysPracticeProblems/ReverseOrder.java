package ArraysPracticeProblems;

public class ReverseOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		reverse(arr);
		
		
	}
	
	static void reverse(int[] arr) {
		
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
