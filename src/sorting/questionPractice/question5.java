package sorting.questionPractice;

public class question5 {
    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }
    static void sorted(int[] arr) {
        int max = findMax(arr);
        int[] count = new int[max+1];

        for (int i = 0; i < arr.length; i++) {
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
        int[] arr = {0, 2, 1, 2, 0, 0};
        sorted(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
