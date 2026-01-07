package ArraysPracticeProblems;

public class CountOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int result = oddCount(arr);
		System.out.println(result);
		

	}
	static int oddCount(int[] arr) {
		int count = 0;
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] %2 != 0) {
				count++;
			}
		}
		
		return count;
		
	}

}
