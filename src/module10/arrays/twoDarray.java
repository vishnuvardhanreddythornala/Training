package module10.arrays;
import java.util.Scanner;
import java.util.Arrays;
public class twoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		
		int[][] arr =  new int[3][3];
		System.out.println(arr.length);
		
		System.out.print("Enter your Input: ");
		
		for(int row = 0; row<arr.length; row++) {
			// for each column in every row
			
			for(int col = 0; col<arr[row].length; col++) {
				arr[row][col]  = sc.nextInt();
				
			}
		}
		
		//output
		
//		for(int row = 0; row < arr.length; row++) {
//			for(int col =0; col < arr[row].length; col++) {
//				System.out.print(arr[row][col]+ " ");
//
//			}
//			System.out.println();
		 for(int row = 0; row<arr.length; row++) {
			 System.out.println(Arrays.toString(arr[row]));
		}
		sc.close();
	}

}
