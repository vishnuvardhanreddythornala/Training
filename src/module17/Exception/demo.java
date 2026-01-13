package module17.Exception;
import java.util.Scanner;
public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		Scanner sc = new Scanner(System.in);
		
		try {
		System.out.print("Enter value of a: ");
		int a = sc.nextInt();
		
		System.out.print("Enter value of b: ");
		int b = sc.nextInt();
		int ans = a/b;
		System.out.println("ans: "+ans);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Handled..");
		}
		finally {
			System.out.println("Finally block executed");
			sc.close();
		}
		System.out.println("Main End");

	}

}
