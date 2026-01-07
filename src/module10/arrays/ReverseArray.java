package module10.arrays;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,4,5,6};
		reverse(arr);
		
	    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }


	static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length -1;
	
		
		
		while(start<end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}
	

}
