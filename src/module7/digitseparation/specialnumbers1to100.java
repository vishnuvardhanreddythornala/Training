//wajp to print special numbers from the range 1 to 100.
package module7.digitseparation;

public class specialnumbers1to100 {

    public static void main(String[] args) {

        System.out.println("Special numbers from 1 to 100:");

        for (int i = 1; i <= 100; i++) {

            int temp = i;
            int sum = 0;
            int product = 1;

            while (temp != 0) {
                int digit = temp % 10;
                sum += digit;
                product *= digit;
                temp = temp / 10;
            }

            int total = sum + product;

            if (total == i) {
                System.out.println(i);
            }
        }
    }
}



