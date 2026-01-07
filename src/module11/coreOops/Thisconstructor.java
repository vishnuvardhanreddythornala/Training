/*
 * this():
 * it is a constructor calling statement
 * it is used to call constructor of same class
 * if we have a n numbers of constructor then we can use n-1 this() calling statement.
 * If any constructor will have this() calling statement then that constructor does not have PLI and IIB
 * 
 * constructor recursion is not possible because it will create an object
 * if we try to achieve constructor recursion so it will give compile time error.
 * 
 * 
 *  */

package module11.coreOops;

public class Thisconstructor {
	 int id;
	 String name ;
	 double sal;
	 
	 //default constructor
	 public Thisconstructor() {
		 this.id =101;
		 this.name = "Unknown";
		 this.sal = 50000.0;
	 }
	 //parameterized constructor
	 
	 public Thisconstructor(int id) {
		 this();
		 this.id = id;
	 }
	 
	 public Thisconstructor(String name) {
		 this();
		 this.name = name;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main start");
		Thisconstructor ref1 = new Thisconstructor(1);
		System.out.println(ref1.id); //1
		System.out.println(ref1.name);//"unknown"
		System.out.println(ref1.sal);//50000.0
		
		
		Thisconstructor ref2 = new Thisconstructor("Vishnu");
		System.out.println(ref2.id);
		System.out.println(ref2.name);
		System.out.println(ref2.sal);
		

	}

}
