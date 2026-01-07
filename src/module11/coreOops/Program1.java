/*
 * Write a Java program that satisfies all the following conditions:

Requirements
	1.	Create a class named Processor.
	2.	Declare two non-static variables x and y.

	4.	Initialize the instance variables only inside a non-static method using the this keyword.
	5.	Create three non-static methods:
	•	initialize() – assigns values to x and y using this.
	•	update() – modifies the values of x and y and demonstrates variable shadowing by declaring a local variable with the same name as one instance variable.
	•	display() – prints the final values of the instance variables.
	6.	One non-static method must call another non-static method using the this keyword.
 */
package module11.coreOops;

public class Program1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Processor p1 = new Processor();
		p1.initialize(10,20);
		p1.update();
		
		

	}

}
class Processor{
	int x;
	int y;
	
	void initialize(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	void update() {
		int x =50;
		int y = 60;
		this.x = x;
		this.y = y;
		this.display();
	}
	void display() {
		System.out.println("x: "+x);
		System.out.println("y: "+y);
		
	}
}


