/*
 * Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

Requirements:

The Laptop class should have three instance variables:
brand (String)
ramSize (int)
price (double)

Implement the following constructors using constructor chaining (this()):

Default constructor that sets default values ("Unknown", 8GB, 50000.0).
Constructor with only brand (calls the default constructor).
Constructor with brand and ramSize (calls the constructor with brand).
Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

Create a printDetails() method to display laptop details.

In main(), create different Laptop objects using all constructors and print their details.
 */

package module11.coreOops;

public class Laptop {
	
	String brand;
	int ramSize;
	double price;
	
	// 1. Default constructor
	public Laptop() {
		this.brand = "Unknown";
		this.ramSize = 8;
		this.price = 50000.0;
		
	}
	// 2. Constructor with only brand
	public Laptop(String brand) {
		this();
		this.brand = brand;
		
		
	}
	 // 3. Constructor with brand and ramSize
	public Laptop(String brand, int ramSize) {
		this(brand);
		this.ramSize = ramSize;
		
	}
	// 4. Final constructor with all fields (proper chaining)
	public Laptop(String brand, int ramSize, double price) {
		this(brand,ramSize);
		this.price = price;
	}
	// Method to print details
	public static void PrintDetails(Laptop l) {
		System.out.println("Details of Laptop: ");
		System.out.println("Brand: "+l.brand);
		System.out.println("RamSize: "+l.ramSize+"GB");
		System.out.println("Price: "+l.price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop("HP");
		Laptop l3 = new Laptop("HP",10);
		Laptop l4 = new Laptop("Hp",10,60000);
		
		PrintDetails(l1);
		PrintDetails(l2);
		PrintDetails(l3);
		PrintDetails(l4);
		

	}

}
