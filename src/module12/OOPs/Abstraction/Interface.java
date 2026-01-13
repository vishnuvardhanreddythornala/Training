package module12.OOPs.Abstraction;

interface fat{
	abstract public void test();
	abstract int add(int a , int b);
	
}
class son implements fat{
	@Override
	
	public void test() {
		System.out.println("Abstract method override");
	}
	
	public int add(int a, int b) {
		return a+b;
	}
}
public class Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//father ref = new father();  we cannot create father object
		
		fat ref = new son();
		ref.test();
		System.out.println("Addition: "+ref.add(10,20));

	}

}
