package ArraysPracticeProblems;

public class NumberTypeCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,-3,4,-6,0,7,-8,0,9};
		numCounter(arr);
		

	}
	
	static void numCounter(int[] arr) {
		int positiveCount = 0;
		int negativeCount = 0;
		int zerosCount = 0;
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] > 0) {
				positiveCount++;
			}else if(arr[i] < 0) {
				negativeCount++;
			}else if(arr[i] == 0) {
				zerosCount++;
			}
			
		}	
		System.out.println("positiveCount:" +positiveCount);
		System.out.println("negativeCount:" +negativeCount);
		System.out.println("zerosCount:" +zerosCount);
	}


}
