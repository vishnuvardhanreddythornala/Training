package ArraysPracticeProblems;

public class CheckElementExists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		 boolean result = checkElement(arr,3);
		 System.out.println(result);
		
		

	}
	static boolean checkElement(int[] arr, int x) {
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] == x) {
				return true;
			}
		}
		return false;
	
	}

}
