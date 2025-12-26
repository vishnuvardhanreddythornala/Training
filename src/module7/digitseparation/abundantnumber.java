/*
 * write a java program to input a number and check and print weather it is an abundant number or not.
 * opt:
 * return 1 if it is abundant number
 * return 0 if it is not an abundant number
 * 
 * explanation
 *  an abundant factor is a number for which are sum of tits proper factors is grater than the number itself
 *  
 *  consider num 12
 *  factors 12 = 1,2,3,..6
 *  sum of factors = 1+2+
 *  as 16>12 so 12 is an abundant.
 */
package module7.digitseparation;

public class abundantnumber {

    public static void main(String[] args) {

        int n = 12;
        int sum = 0;

        // find proper factors
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum > n) {
            System.out.println(1); 
        } else {
            System.out.println(0); 
        }
    }
}

