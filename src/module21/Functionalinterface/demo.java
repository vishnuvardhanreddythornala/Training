package module21.Functionalinterface;

public class demo {
	
@FunctionalInterface
interface F1{
	void greet();
}
@FunctionalInterface
interface F2{
	int add(int a, int b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		F1 obj1 = new F1() {
			@Override
			public void greet() {
				System.out.println("Hello world using anonymus class");
			}
		};
		obj1.greet();
		System.out.println("------------------------------------------");
		F1 obj2 = () -> System.out.println("Hello world using Lambda");
		obj2.greet();
		System.out.println("------------------------------------------");
		
		F2 ref1 = new F2() {
			public int add(int a, int b) {
				return a+b;
			}
		};
		System.out.println("using anonumus class: "+ref1.add(10,20));
		System.out.println("------------------------------------------");
		
		F2 ref2 = (a,b) -> a+b;
		System.out.println("Using lambda exp : "+ref2.add(20, 30));
		

	}

}
