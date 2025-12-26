// wajp to print sum of all numbers from range 1 to 5 without using any loop.
package module9.recursion;

public class sumofnumbers {

    static int sum = 0;   // added static variable

    public static void main(String[] args) {
        printsum(1);
        System.out.println("Sum is: " + sum); // print final sum
    }

    public static void printsum(int n) {
        if (n <= 5) {
            sum = sum + n;   
            printsum(n + 1); 
        }
    }
}
