package module12.OOPs.Polymorphism;
class Father{
	int a = 10;
	static int b = 100;
	
}
class Son extends Father{
	int a = 20;
	static int b = 200;
}
public class variableShadowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Start");
		System.out.println("---Father object stored in Father ref variable---");
		Father ref1 = new Father();
		System.out.println(ref1.a);
		System.out.println(ref1.b);
		
		System.out.println("---Son object stored in Son ref variable---");
		Son ref2 = new Son();
		System.out.println(ref2.a);
		System.out.println(ref2.b);
		
		System.out.println("---Upcasting---");
		Father ref3 = new Son();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		
		System.out.println("---Downcasting---");
		Son ref4 = (Son)ref3;
		System.out.println(ref4.a);
		System.out.println(ref4.b);
		System.out.println("Main End");

	}

}
