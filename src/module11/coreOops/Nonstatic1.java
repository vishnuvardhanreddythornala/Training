//wajp to execute instance initalizer block and  execute non static method before the execution of main method
package module11.coreOops;

public class Nonstatic1 {
	
	{
		//Instance
		System.out.println("Instance initializer block executed");
	}
	void NonStaticMethod() {
		System.out.println("Non- static block executed");
	}
	
	static {
		System.out.println("Static block starts");
		
		Nonstatic1 obj = new Nonstatic1(); //-- creation of object
		obj.NonStaticMethod(); // -- calling non static block
		
		System.out.println("Static block end");
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method start");
		System.out.println("Main method end");

	}

}
