package module2.switchcase;
import java.util.Scanner;
public class ArithmeticOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.println("Choose Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("How many numbers (2 / 3 / 4)? ");
        int count = sc.nextInt();

        double a, b, c, d, result = 0;

        switch (choice) {

            case 1: // ADDITION
                if (count == 2) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a + b;
                } else if (count == 3) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    result = a + b + c;
                } else if (count == 4) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    d = sc.nextDouble();
                    result = a + b + c + d;
                } else {
                    System.out.println("Invalid count!");

                }
                System.out.println("Result = " + result);
                break;

            case 2: // SUBTRACTION
                if (count == 2) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a - b;
                } else if (count == 3) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    result = a - b - c;
                } else if (count == 4) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    d = sc.nextDouble();
                    result = a - b - c - d;
                } else {
                    System.out.println("Invalid count!");

                }
                System.out.println("Result = " + result);
                break;

            case 3: // MULTIPLICATION
                if (count == 2) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a * b;
                } else if (count == 3) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    result = a * b * c;
                } else if (count == 4) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    c = sc.nextDouble();
                    d = sc.nextDouble();
                    result = a * b * c * d;
                } else {
                    System.out.println("Invalid count!");

                }
                System.out.println("Result = " + result);
                break;

            case 4: // DIVISION
                if (count == 2) {
                    a = sc.nextDouble();
                    b = sc.nextDouble();
                    result = a / b;
                } else {
                    System.out.println("Division supports only 2 numbers!");

                }
                System.out.println("Result = " + result);
                break;

            default:
                System.out.println("Invalid operation choice!");
        }

        sc.close();

	}

}
