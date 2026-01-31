package searching;

public class binarySearchMethod2 {
    static boolean searching(int[] arr, int st, int end, int target) {
        if(st > end) return false; //base case

        int mid = (st + end) / 2;
        if(target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return searching(arr, st, mid-1, target); //sub-problems
        } else {
            return searching(arr, mid+1, end, target); //sub-problems
        }

    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int target = 0;
        while(target != 10) {
            System.out.printf("%d exists in array ? --> %b\n", target, searching(arr, 0, n-1, target));
            target++;
        }
    }
}
