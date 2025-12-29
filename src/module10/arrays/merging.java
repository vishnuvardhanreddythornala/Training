// merging two arrays without using collections
package module10.arrays;

public class merging {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8, 9};

        int[] merged = new int[arr1.length + arr2.length];

        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            merged[index++] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[index++] = arr2[i];
        }

        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
