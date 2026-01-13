package module12.OOPs.Abstraction;

abstract class Father{
	//abstract methods
	
	abstract public void test();
	abstract public int add(int a , int b);
}

class Son extends Father{
	
	@Override
	public void test() {
		System.out.println("Test method");
	}
	
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	
	public void demo() {
		System.out.println("SOn class demo method");
	}
}


public class AbstractMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Father ref = new Son();
		ref.test();
		System.out.println("Addition result: " + ref.add(2, 5));


	}

}
