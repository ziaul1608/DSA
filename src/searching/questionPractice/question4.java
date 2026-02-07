package searching.questionPractice;

public class question4 {
    static int findIdx(int[] arr) {
        int low = 0, high = arr.length-1;

        while(low < high) {
            int mid = low + (high-low)/2;
            if(arr[mid] > arr[high]) low = mid+1;
            else high = mid;
        }
        return low;
     }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(findIdx(arr));
    }
}
