package searching;

public class binarySearchMethod1 {
    static boolean search(int[] arr, int target) {
        int n = arr.length;
        int st = 0, end = n-1; // 0 based indexing

        while(st <= end) {
            int mid = (st + end) / 2;
            if(target == arr[mid]) {
                return true;
            } else if(target < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target = 0;
        while(target != 10) {
            System.out.printf("%d exists in array ? --> %b\n", target, search(arr, target));
            target++;
        }
    }
}
