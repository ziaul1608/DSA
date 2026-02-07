package searching.questionPractice;

public class question5 {
    static int foundTargetAt(int[] arr, int target) {
        int low = 0, high = arr.length-1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            if(arr[mid] == target) return mid;
            // left half sorted
            if (arr[low] <= arr[mid]) {
                if (target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // right half sorted
            else {
                if (target > arr[mid] )
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        int target = 4;
        System.out.println(foundTargetAt(arr, target));
    }
}
