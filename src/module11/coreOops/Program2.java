/*
 * A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
 */
package module11.coreOops;


class AddressClass {
    
    String city;
    AddressClass(String city) {
    	this.city = city;
    }
}


class EmployeeClass {
    int id;
    AddressClass address;

    EmployeeClass(int id, AddressClass address) {
    	this.id = id;
    	this.address = address;
    }

    
    EmployeeClass(EmployeeClass emp) {           //copy
    	this.id = emp.id;
    	this.address = emp.address;
        
    }
}


public class Program2 {

    public static void main(String[] args) {
    	
        AddressClass addr = new AddressClass("Hyderabad");
        EmployeeClass emp1 = new EmployeeClass(1, addr);
        EmployeeClass emp2 = new EmployeeClass(emp1);
        emp2.address.city = "Punjab";
        System.out.println("Emp1 City: " + emp1.address.city);
        System.out.println("Emp2 City: " + emp2.address.city);
    	
    }
}
