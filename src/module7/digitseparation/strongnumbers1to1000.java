package module7.digitseparation;

public class strongnumbers1to1000 {

    public static void main(String[] args) {

        System.out.println("Strong numbers from 1 to 1000:");

        for (int num = 1; num <= 1000; num++) {

            int temp = num;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;

                int fact = 1;
                for (int i = 1; i <= digit; i++) {
                    fact = fact * i;
                }

                sum = sum + fact;
                temp = temp / 10;
            }

            if (sum == num) {
                System.out.println(num);
            }
        }
    }
}

