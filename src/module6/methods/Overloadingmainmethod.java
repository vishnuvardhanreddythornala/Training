//wajp to overload main method.
package module6.methods;

public class Overloadingmainmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("original main method start");
		main(10);
		main("Hello");

	}
	public static void main(int a) {
		System.out.println("overloaded main with int :" +a);
	}
	public static void main(String s) {
		System.out.println("overloaded main with string: "+s);
	}

}
