//.Write a program to check the given number is negative number , positive number, or zero


package module1.conditionals;
import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + "positive number");
        } else if (num < 0) {
            System.out.println(num + "Negative number");
        } else {
            System.out.println("Zero");
        }
        sc.close();
    }
}



