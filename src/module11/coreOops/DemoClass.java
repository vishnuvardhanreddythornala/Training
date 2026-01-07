/*
 * 4. Write a Java program that defines a class named DemoClass with the following specifications:

	The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
	The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
	The class should contain one non-static method named displayMessage(), which prints a message when called.
	The class should contain two static methods:
	staticMethodOne(): Prints a message when called.
	staticMethodTwo(): Prints a different message when called.
	
	Inside the main() method, perform the following actions:
	Call both static methods directly using the class name.
	Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor.
	Call the non-static method using the object reference.

-------------------------------------------------------------------------------------
 */
package module11.coreOops;

public class DemoClass {
	//Static Initialization Block
	static {
		
		System.out.println("Static Initialization Block1 Executed");
	}
	//Static Initialization Block
	static { 
		
		System.out.println("Static Initialization Block2 Executed");
			
	}
	
	//Instance Initialization Block
	{
	    System.out.println("Instance Initialization Block executed");
	}
	
	 // Constructor
    public DemoClass() {
        System.out.println("Constructor executed");
    }
    
    //non-static method
	public void displayMessage() {
		
		System.out.println("Non static method Executed");
		
	}
	//static method
	public static void MethodOne() {
		System.out.println("Static Method one executed");
	}
	
	//static method
	public static void MethodTwo() {
		System.out.println("Ststic method two executed");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoClass.MethodOne();
		DemoClass.MethodTwo();
		
		DemoClass ref = new DemoClass();
		ref.displayMessage();
		

	}

}
