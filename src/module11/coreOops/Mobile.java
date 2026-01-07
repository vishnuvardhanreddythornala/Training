/*
 * A mobile phone can be initialized with default settings or custom settings.

Create class Mobile with:
	•	String brand
	•	int storage
	•	boolean is5G

Requirements:
	1.	Default constructor sets:
	•	brand = “Unknown”
	•	storage = 64
	•	is5G = false
	2.	Parameterized constructor sets all values.
	3.	Use this() to chain constructors.
 */
package module11.coreOops;

public class Mobile {
	
	String brand;
	int storage;
	boolean is5G;
	
	public Mobile() {
		this.brand = "Unknown";
		this.storage = 64;
		this.is5G = false;		
	}
	public Mobile(String brand, int storage, boolean is5G) {
		this();
		this.brand = brand;
		this.storage = storage;
		this.is5G = is5G;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mobile ref1 = new Mobile();
		System.out.println(ref1.brand);
		System.out.println(ref1.storage);
		System.out.println(ref1.is5G);
		
		Mobile ref2 = new Mobile("Apple", 128, true);
		System.out.println(ref2.brand);
		System.out.println(ref2.storage);
		System.out.println(ref2.is5G);
		
		

	}

}
