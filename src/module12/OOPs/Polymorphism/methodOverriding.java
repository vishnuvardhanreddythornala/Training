package module12.OOPs.Polymorphism;

class p1{
	public void test() {
		System.out.println("Father class test method");
	}
	public void demo(int a) {
		System.out.println("Father class demo started");
	}
}
class c1 extends p1{
	@Override
	public void test() {
		System.out.println("Son class test method");
	}
	@Override
	public void demo(int a) {
		System.out.println("Son class demo method");
	}
}
public class methodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
