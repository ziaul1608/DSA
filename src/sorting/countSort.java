package sorting;

public class countSort {
    static int findMax(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    static void sorting(int[] arr) {
        int n = arr.length;
        int max = findMax(arr);
        int[] count = new int[max+1];
        for (int i = 0; i < n; i++) {
            count[arr[i]]++;
        }
        int k = 0;
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                arr[k++] = i;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 2, 2, 5};
        int n = arr.length;
        sorting(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
