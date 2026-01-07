package module11.coreOops;

public class Nonstatic {
	static int b = 20;
	int a = 10;
	public void test() {
		System.out.println("Test start");
		System.out.println("Directly: "+a);
		System.out.println("We can access static variable in non static with the help of ClassName: "+Nonstatic.b);
		System.out.println("with the help of this: "+this.a);
		System.out.println("Test end");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Nonstatic obj = new Nonstatic();
		obj.test();
		System.out.println("Main end");
		

	}

}
