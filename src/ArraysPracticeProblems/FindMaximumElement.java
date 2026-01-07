package ArraysPracticeProblems;

public class FindMaximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,12,4,5,6,27,8,56};
		int result = maxNum(arr);
		System.out.println(result);

	}
	static int maxNum(int[] arr) {
		int max = arr[0];
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
		}
		return max;
	}

}
