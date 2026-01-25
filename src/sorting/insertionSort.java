package sorting;

import java.util.Scanner;

public class insertionSort {
    static void insertionSorting(int[] a) {
        int n = a.length;
        for (int i = 1; i <= n-1; i++) {
            int j = i;
            while(j > 0 && a[j] < a[j-1]) {
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;

                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter size of array = ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array elements :- ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        insertionSorting(arr);
        System.out.println("sorted array :- ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
