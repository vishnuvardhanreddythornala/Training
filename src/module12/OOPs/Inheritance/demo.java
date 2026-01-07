//Static
package module12.OOPs.Inheritance;

class Father{
	static int a = 10;
	public static void test1() {
		System.out.println("Father class static method");
	}
	static{
		System.out.println("SIB Father class");
	}
}
class Son extends Father{
	static int b = 20;
	public static void test2() {
		System.out.println("Son class static method");
	}
	static {
		System.out.println("SIB Son class");
	}
}

public class demo {

	static {
		System.out.println("SIB Driver Class");
	}
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		System.out.println(Father.a);
		Father.test1();
		System.out.println(Son.a);
		System.out.println(Son.b);
		Son.test2();
		System.out.println("Main End");

	}
*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Son.a);
		System.out.println(Son.b);
		Son.test1();
		System.out.println(Father.a);
		Father.test1();

	}
	
}
