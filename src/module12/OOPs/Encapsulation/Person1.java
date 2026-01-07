/*
 * Q1. Write a Java program to create a class called Person with private instance variables name, age. and country. 
 * Provide public getter and setter methods to access and modify these variables.
------------------------------------------------------------------------------------------
 */
package module12.OOPs.Encapsulation;

class Person{
	//private variables
	
	private String name;
	private int age;
	private String country;
	
	public String getname() {
		return name;
	}
	
	public int getage() {
		return age;
	}
	public  String getcountry() {
		return country;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setage(int age) {
		this.age = age;
	}
	public void setcountry(String country) {
		this.country = country;
	}
}

//Driver class
public class Person1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person ref = new Person();
		
		// setting values using setters
			ref.setname("Vishnu");
			ref.setage(22);
			ref.setcountry("India");
		
		// Getting values using getters
		System.out.println("Person name : "+ref.getname());
		System.out.println("Person age: "+ref.getage());
		System.out.println("Person country: "+ref.getcountry());
		
		

	}

}
