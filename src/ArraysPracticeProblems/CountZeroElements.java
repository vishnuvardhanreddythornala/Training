package ArraysPracticeProblems;

public class CountZeroElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,2,3,0,4,5,6,0,0,7};
		int result = countZeros(arr);
		System.out.println(result);

	}
	static int countZeros(int[] arr) {
		
		int count = 0;
		for(int i =  0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
			}
		}
		return count;
	}

}
