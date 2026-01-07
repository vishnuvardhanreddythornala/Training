/*
 * Q3. Write a Java program to create a class called Circle with a private instance variable radius. 
 * Provide public getter and setter methods to access and modify the radius variable. However, provide two methods called calculateArea() 
 * and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.
------------------------------------------------------------------------------------------
 */

package module12.OOPs.Encapsulation;

public class Circle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle ref = new Circle();
		
		ref.setradius(3);
		System.out.println("Radius: "+ref.getradius());
		System.out.println("Area: "+ref.calculateArea());
		System.out.println("Perimeter: "+ref.calculatePerimeter());

	}

}

class Circle{
	private double radius;
	
	//getter
	public double getradius() {
		return radius;
	}
	//setter
	public void setradius(double radius) {
		this.radius= radius;	
	}
	
	public  double calculateArea() {
		double area = 3.14159265359 * radius * radius;
		return area;
	}
	
	public  double calculatePerimeter() {
		double perimeter = 2 * 3.14159265359 * radius;
		return perimeter;
	}
}
