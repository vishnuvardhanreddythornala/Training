package module12.OOPs.Abstraction;


interface Dad {
	static int a = 10;// final static int a = 10
	int b = 20; //  final static int b = 20
	
	public static void test() {
		System.out.println("static method");
	}
	void abs();
	
}
class child implements Dad {
	@Override
	public void abs() {
		System.out.println("abstract method");
	}
}

public class InterfaceClass {
	public static void main(String[] args) {
		System.out.println("Main start");
//		Father ref = new Father(); CTE Cannot instantiate the type Father
		Dad ref = new child();
		ref.abs();
		System.out.println(Dad.a);
		System.out.println(Dad.b);
		
//		ref.test(); CTE This static method of interface Father can only be accessed as Father.test
		Dad.test();
	}
	

}


