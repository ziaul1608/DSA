package searching.questionPractice;

public class question2 {
    static int lastOccurence (int[] arr, int x) {
        int n = arr.length;
        int st = 0, end = n-1;
        int lOcc = -1;
        while(st <= end) {
            int mid = st + (end - st)/2;
            if(arr[mid] == x) {
                lOcc = mid;
                st = mid+1;
            }
            else if (x < arr[mid]) end = mid-1;
            else st = mid+1;
        }
        return lOcc;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int x = 5;
        System.out.println("Last Occurence of " + x + " is " + lastOccurence(arr, x));
    }
}
