package ArraysPracticeProblems;

public class SeparateEvenOdd {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        separateEvenOdd(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void separateEvenOdd(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // If left is even, it's in correct place
            if (arr[left] % 2 == 0) {
                left++;
            }
            // If right is odd, it's in correct place
            else if (arr[right] % 2 != 0) {
                right--;
            }
            // Swap odd on left with even on right
            else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
}
