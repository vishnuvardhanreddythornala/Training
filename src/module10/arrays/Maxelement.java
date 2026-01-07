package module10.arrays;

public class Maxelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,23,4,5,6};
		
		System.out.println(max(arr));

	}
	
	static int max(int[] arr) {
		int max = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
