package module12.OOPs.Abstraction;
abstract class Parent{
	static int a = 10;
	int b = 20;
	
	//static method
	public static void test() {
		System.out.println("Static method");
	}
	
	//non- static method
	public void demo() {
		System.out.println("Non static method");
	}
	
	//abstract class
	abstract public void abs();
	
	//SIB
	static{
		System.out.println("Static initializer block");
	}
	//IIB
	{
		System.out.println("Instance initializer block");
	}
	
	//constructor
	public Parent(){
		System.out.println("Constructor");
	}
	
}

class Child extends Parent{
	@Override
	public void abs() {
		System.out.println("Abstarct method");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		
		Parent ref = new Child();
		System.out.println(ref.a);
		System.out.println(ref.b);
		ref.test();
		ref.demo();
		ref.abs();
		System.out.println("Main End");

	}

}
