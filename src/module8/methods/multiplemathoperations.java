/*
 * Write a java program tht performs multiple mathematical operations using methods.

1. FInd maximum: define a method findMax(int a, int b , int c) that takes three integer
 arguments and returns the largest number
 
 2.check prime: define a method isPrime(int num) that takes an integer and returns true is is prime or false.
 3.find minimum: define method findMin(. . . ) returns smallest
 4.fibonacci calculation:  define a method fibonacci(int n) that takes integer n and teruns nth fibo
 
 */


package module8.methods;

public class multiplemathoperations {

    public static void main(String[] args) {

        int max = findMax(5, 6, 2);
        System.out.println("Maximum: " + max);

        boolean prime = isPrime(7);
        System.out.println("Is Prime: " + prime);

        int min = findMin(5, 6, 2);
        System.out.println("Minimum: " + min);

        int fib = fibonacci(7);
        System.out.println("7th Fibonacci number: " + fib);
    }

    // 1. Find Maximum
    public static int findMax(int a, int b, int c) {
        int max = a;

        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }

    // 2. Check Prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count == 2;
    }

    // 3. Find Minimum
    public static int findMin(int a, int b, int c) {
        int min = a;

        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }

        return min;
    }

    // 4. Fibonacci (nth term)
    public static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, c = 0;

        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }

        return c;
    }
}


