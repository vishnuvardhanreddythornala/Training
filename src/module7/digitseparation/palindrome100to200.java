// 100 to 200
package module7.digitseparation;

public class palindrome100to200 {

    public static void main(String[] args) {

        System.out.println("Palindrome numbers from 100 to 200:");

        for (int num = 100; num <= 200; num++) {

            int temp = num;
            int rev = 0;

            while (temp != 0) {
                int digit = temp % 10;
                rev = rev * 10 + digit;
                temp = temp / 10;
            }

            if (num == rev) {
                System.out.println(num);
            }
        }
    }
}

