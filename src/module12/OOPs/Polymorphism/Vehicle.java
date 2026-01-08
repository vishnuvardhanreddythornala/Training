package module12.OOPs.Polymorphism;
/*
 * Q. Write a Java program to create a class Vehicle with a method called speedUp(). 
 * Create two subclasses Car and Bicycle. Override the speedUp() method in each subclass to increase the vehicle's speed differently.
 */
class Vehicle1{
	int speed = 0;
	public void speedUp() {
		speed += 5;
		System.out.println("Vehicle speed increased to: " + speed + " km/h");
	}
}
class Car extends Vehicle1 {
	@Override
	public void speedUp() {
		speed += 20;
		System.out.println("Car speed increased to: " + speed + " km/h");
	}
}
class Bicycle extends Vehicle1{
	@Override
	public void speedUp() {
		speed += 10;
		System.out.println("Bicycle speed increased to: " + speed + " km/h");
	}
}

public class Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle1 v= new Car();// Runtime polymorphism
		v.speedUp();
		
		Vehicle1 v1 = new Bicycle();
		v1.speedUp();
		

	}

}
