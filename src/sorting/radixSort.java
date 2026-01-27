package sorting;

import java.util.Arrays;

public class radixSort {

    static void radixSorting(int[] arr) {

        // find maximum number
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }

        // count number of digits in max
        int digits = 0;
        while (max > 0) {
            digits++;
            max = max / 10;
        }

        int exp = 1;

        // simple for loop (runs for number of digits)
        for (int d = 1; d <= digits; d++) {

            int[] count = new int[10];
            int[] output = new int[arr.length];

            // count digits
            for (int i = 0; i < arr.length; i++) {
                int digit = (arr[i] / exp) % 10;
                count[digit]++;
            }

            // cumulative count
            for (int i = 1; i < 10; i++) {
                count[i] += count[i - 1];
            }

            // build output
            for (int i = arr.length - 1; i >= 0; i--) {
                int digit = (arr[i] / exp) % 10;
                output[count[digit] - 1] = arr[i];
                count[digit]--;
            }

            // copy back
            for (int i = 0; i < arr.length; i++) {
                arr[i] = output[i];
            }

            exp = exp * 10;
        }
    }

    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 802, 24, 2, 66};

        System.out.println("Before: " + Arrays.toString(arr));
        radixSorting(arr);
        System.out.println("After:  " + Arrays.toString(arr));
    }
}

