package ArraysPracticeProblems;

/*
 * arr = [2, 5, 8, 1], X = 4  
   Output = 2
 */
public class CountElementsGreaterThanX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,8,1};
		
		int result = greaterCount(arr,4);
		System.out.println(result);

	}
	static int greaterCount(int[] arr, int x) {
		int count = 0;
		
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		return count;
	}

}
