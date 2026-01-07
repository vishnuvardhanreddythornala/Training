package module10.arrays;
import java.util.Arrays;
public class swaapingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4,5,6,7};
		swap(arr,0,4);
		
		System.out.println(Arrays.toString(arr));
	}
	static void swap(int[] arr, int index1, int index2) {
		int temp = arr[index1];
		arr[index1]= arr[index2];
		arr[index2] = temp;
	}

}
