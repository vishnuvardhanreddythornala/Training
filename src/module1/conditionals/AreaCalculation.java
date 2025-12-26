package module1.conditionals;
import java.util.Scanner;
public class AreaCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Select shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        System.out.println("4. Square");

        System.out.print("Enter an option: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1: // Circle
                System.out.print("Enter radius: ");
                double r = sc.nextDouble();
                double circleArea = 3.14159 * r * r;
                System.out.println("Area of Circle = " + circleArea);
                break;

            case 2: // Rectangle
                System.out.print("Enter length: ");
                double length = sc.nextDouble();
                System.out.print("Enter width: ");
                double width = sc.nextDouble();
                double rectangleArea = length * width;
                System.out.println("Area of Rectangle = " + rectangleArea);
                break;

            case 3: // Triangle
                System.out.print("Enter base: ");
                double base = sc.nextDouble();
                System.out.print("Enter height: ");
                double height = sc.nextDouble();
                double triangleArea = 0.5 * base * height;
                System.out.println("Area of Triangle = " + triangleArea);
                break;

            case 4: // Square
                System.out.print("Enter side: ");
                double side = sc.nextDouble();
                double squareArea = side * side;
                System.out.println("Area of Square = " + squareArea);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();

	}

}
