package module13.Relationships;

class Engine{
	public void start() {
		System.out.println("Engine started");
	}
	public void stop() {
		System.out.println("Engine stopped");
	}
	
}
class Car{
	private Engine engine;
	//constructor
	public Car() {
		engine = new Engine();
	}
	public void drive() {
		engine.start();
		System.out.println("Car is running");
	}
	public void park() {
		engine .stop();
			System.out.println("Car is parked");
		
	}
}
public class demoComposition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		car.drive();
		
		System.out.println("-------------");
		car.park();
		
}
}