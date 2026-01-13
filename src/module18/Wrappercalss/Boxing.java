package module18.Wrappercalss;

public class Boxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		
		//conversion of int to Integer
		Integer i = a;
		System.out.println("Implicit boxing: "+i);
		
		//conversion of Integer to int
		Integer j = Integer.valueOf(a);
		System.out.println("Explicit boxing: "+j);
	}

}
