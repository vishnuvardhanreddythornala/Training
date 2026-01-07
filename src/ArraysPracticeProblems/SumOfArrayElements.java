package ArraysPracticeProblems;

public class SumOfArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6};
		int result = Sumele(arr);
		System.out.println(result);
		

	}
	static int Sumele(int[] arr) {
		int sum = 0;
		for(int i = 0; i< arr.length; i++) {
			sum = sum+arr[i];
		}
		return sum;
	}

}
