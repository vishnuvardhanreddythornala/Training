package ArraysPracticeProblems;

public class FindMinimumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,12,4,5,6,27,8,56};
		int result = minNum(arr);
		System.out.println(result);

	}
	static int minNum(int[] arr) {
		int min = arr[0];
		
		for(int i = 1; i< arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			
		}
		return min;
	}

}
