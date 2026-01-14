package module10.arrays;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,11,12,13,14};
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		//for loop
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i] + "");
			
		}
		System.out.println();
		
		//using new keyword
		
		int[] arr2 = new int[5];
		for(int i = 0; i<arr2.length; i++) {
			System.out.print(arr2[i] + "");
			
		}
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i< arr2.length; i++) {
			System.out.println("ENter  value at index " + i+ " : ");
		}
		
		
		sc.close();

	}

}
