package module12.OOPs.Encapsulation;
/*
 * Q2. Write a Java program to create a class called Employee with private instance variables 
 * employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables,
 *  but provide a getter method for the salary variable that returns a formatted string.
------------------------------------------------------------------------------------------
 */

class Employee{
	private int employee_id;
	private String employee_name;
	private double employee_salary;
	
	public int getemployee_id() {
		return  employee_id;
	}
	public String getemployee_name() {
		return employee_name;
	}
	public String getemployee_salary() {
        return "₹ " + employee_salary;
    }
	
	public void setemployee_id(int employee_id) {
		this.employee_id= employee_id;
	}
	
	public void setemployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public void setemployee_salary(double employee_salary) {
		this.employee_salary = employee_salary;
	}
	
	
}
public class Employee1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee ref = new Employee();
		
		// setters
		ref.setemployee_id(12211831);
		ref.setemployee_name("Vishnu");
		ref.setemployee_salary(30000);
		
		//getters
		System.out.println("Employee ID: "+ref.getemployee_id());
		System.out.println("Employee name: "+ref.getemployee_name());
		System.out.println("Employee Salary: "+ref.getemployee_salary());
		
		

	}

}
