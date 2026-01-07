package Practice;

public class AddingElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 10};
		int n = arr.length;
		int[] newarr = new int[n+1];
		
		for(int i=0; i<n;i++) {
			newarr[i] = arr[i];
		}
		
		newarr[n] = 50;
		
		for(int i=0; i<newarr.length; i++) {
			System.out.print(newarr[i] + " ");
		}

	}

}
