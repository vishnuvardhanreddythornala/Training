package Practice;

public class zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,0,2,3,0,9,0,2};
		int pos = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i] != 0) {
				arr[pos] = arr[i];
				pos++;
			}
		}
		while(pos < arr.length) {
			arr[pos] = 0;
			pos++;
		}
		for(int i = 0 ; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
