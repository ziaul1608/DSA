package searching.questionPractice;

public class question1 {
    static int firstOccurence(int[] arr, int x) {
        int n = arr.length;
        int st = 0, end = n-1;
        int focc = -1;
        while(st <= end) {
            int mid = st + (end-st)/2;
            if(arr[mid] == x) {
                focc = mid;
                end = mid-1;
            } else if (x < arr[mid]) {
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return focc;
    }
    public static void main(String[] args) {
        int[] arr = {2, 5, 5, 5, 6, 6, 8, 9, 9, 9};
        int x = 5;
        System.out.println("First Occurence of " + x + " is " + firstOccurence(arr, x));
    }
}
