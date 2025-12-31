package module11.oops;

// Main class
public class NonStaticVariables {

    public static void main(String[] args) {
        Car car1 = new Car("Tesla Model S", "Red");
        Car car2 = new Car("BMW X5", "Black");

        car1.display();
        car2.display();
    }
}

// Separate class
class Car {
    String model;
    String color;

    Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    void display() {
        System.out.println("Car model: " + model);
        System.out.println("Car color: " + color);
    }
}
