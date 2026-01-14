package Oops.Abstraction;


abstract class Employee{
	int empId;
	String name;
	double baseSalary;
	
	Employee(int empId, String name, double baseSalary){
		this.empId = empId;
		this.name = name;
		this.baseSalary = baseSalary;
	}
	
	void displayDetails() {
		System.out.println("Employee Id: "+empId);
		System.out.println("Employee name: "+name);
	}
	
	abstract void calculateSalary();
	abstract void getRole();
}

//Employee type



public class EmployeeManagementAndPayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
