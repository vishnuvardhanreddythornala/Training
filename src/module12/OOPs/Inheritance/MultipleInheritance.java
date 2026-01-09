package module12.OOPs.Inheritance;
/*
 * wajp to acheive multiple inheritance. 
 */

interface dad{
	default void test() {
		System.out.println("Dad interface");
	}
}
interface mom{
	default void test() {
		System.out.println("Mom interface");
	}
}
class child implements dad,mom{
	
	@Override
	public void test() {
		System.out.println("Child class");
}
}
	
public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dad ref1 = new child();
		ref1.test();
		mom ref2 = new child();
		ref2.test();
		
		
		

	}

}
