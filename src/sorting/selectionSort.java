package sorting;

import java.util.Scanner;

public class selectionSort {
    static void selectionSorting(int[] a) {
        int n = a.length;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i+1; j <= n-1; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("enter size of array: ");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of the array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        selectionSorting(arr);
        System.out.println("sorted array : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
