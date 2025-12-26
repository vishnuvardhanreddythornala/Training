/*
 * input : 2514795
 * opt : 162
 * expla: odd digit int the given numbers are 5,9,7,1,5. The sum of odd digit is 
 * 
 * n = 25147
 * outpt  = even sum * odd sum
 */
package module7.digitseparation;

import java.util.Scanner;

public class evenoddsumdigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int evenSum = 0;
        int oddSum = 0;

        while (num != 0) {
            int digit = num % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            } else {
                oddSum += digit;
            }

            num = num / 10;
        }

        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
        System.out.println("Even sum * Odd sum = " + (evenSum * oddSum));

        sc.close();
    }
}

