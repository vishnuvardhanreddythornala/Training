//Aggregate

package module13.Relationships;

class Address{
	String city;
	String states;
	public Address(String city, String states) {
		this.city = city;
		this.states = states;
	}
		
}
class Student{
	int id;
	String name;
	double marks;
	Address address;
	public Student(int id, String name, double marks, Address address) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	void display() {
		System.out.println("ID: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+marks);
		System.out.println("City: "+address.city);
		System.out.println("State: "+address.states);
		
	}
	
}

public class demoAggregation {
	public static void main(String[] args) {
		Address ad = new Address("Jalandhar", "Punjab");
		Student s1 = new Student(1,"vishnu",90.3,ad);
		
		System.out.print("Student with ID "+s1.id);
		System.out.print(" named "+s1.name);
		System.out.print(" he scored "+s1.marks);
		System.out.print(" who lives in a city called "+s1.address.city);
		System.out.print(" where it belongs to "+s1.address.states);
	}
	
}
