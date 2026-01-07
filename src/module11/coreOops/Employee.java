/*
 * 2. Write a Java program that performs the following tasks:
	Create a class Employee with three attributes: id, name, and sal (salary).
	Implement a parameterized constructor to initialize these attributes.
	Create a non-static method printDetails() to display employee details.
	In the main() method:
	Create an 4 Employee object
---------------------------------------------------------------------
 */
package module11.coreOops;

public class Employee {
	int id;
	String Name;
	double sal;
	
	public Employee(int id, String name,double sal) {
		this.id = id;
		this.Name=name;
		this.sal = sal;
	}
	
	void PrintDetails() {
		System.out.println("EMployee Details: ");
		System.out.println("Employee ID: "+id);
		System.out.println("Employee Name: "+Name);
		System.out.println("Employee Salary: "+sal);
		System.out.println("----------------------");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee(1,"Vishnu",60000);
		Employee e2 = new Employee(2,"Reddy", 50000);
		Employee e3 = new Employee(3,"Raghu" , 25000);
		Employee e4 = new Employee(4,"Mani" , 30000);
		
		e1.PrintDetails();
		e2.PrintDetails();
		e3.PrintDetails();
		e4.PrintDetails();
	}

}
