/*
 * Given an integer array a and a digit k, find the number in the array that contains the maximum occurrence of digit k.

Input
int[] a = {37, 823, 122, 2322, 6017};
int k = 2;

Output
2322

Explanation

Count the occurrence of digit 2 in each number:

Digit 2 in 37 → 0

Digit 2 in 823 → 1

Digit 2 in 122 → 2

Digit 2 in 2322 → 3

Digit 2 in 6017 → 0

The number 2322 contains the maximum occurrences of digit 2, so it is the output.
 */
package module10.arrays;

public class occurenceofdigit {

    public static void main(String[] args) {

        int[] arr = {37, 823, 122, 2322, 6017};
        int k = 2;

        int maxcount = 0;
        int result = arr[0];

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];   
            int count = 0;

            while (num != 0) {
                int digit = num % 10;
                if (digit == k) {
                    count++;
                }
                num = num / 10;  
            }

            if (count > maxcount) {
                maxcount = count;
                result = arr[i]; 
            }
        }

        System.out.println(result);
    }
}
