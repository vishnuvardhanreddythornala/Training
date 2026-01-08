package module12.OOPs.Polymorphism;

/*
 * Write a Java program to create a base class Shape with a method called calculateArea(). 
 * Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method 
 * in each subclass to calculate and return the shape's area.
 */

class Shape{
	public double calculateArea() {
		return 0;
	}
}
class Circle extends Shape{
	double radius = 3.0;
	@Override
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
}
class Rectangle extends Shape{
	int length = 10;
	int breadth = 20;
	@Override
	public double calculateArea() {
		return length * breadth;
	}
}
class Triangle extends Shape{
	int base = 4;
    int height = 6;
	@Override
	public double calculateArea() {
		return 0.5 * base * height;
		
	}
}
public class Shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		
		s = new Circle();
		System.out.println("Area of a Circle: "+s.calculateArea());
		
		s = new Rectangle();
		System.out.println("Area of a Rectangle: "+s.calculateArea());
		
		s = new Triangle();
		System.out.println("Area of Triangle: "+s.calculateArea());

	}

}
