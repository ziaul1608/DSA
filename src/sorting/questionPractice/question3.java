package sorting.questionPractice;

public class question3 {
    static void sort(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        //process all adjacent elements
        for (int i = 1; i < n; i++) {
            if(arr[i-1] > arr[i]) {
                if(x == -1) {
                    x = i-1;
                    y = i;
                } else {
                    y = i;
                }
            }
        }

        //swap x and y in arr
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        int n = arr.length;
        sort(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
