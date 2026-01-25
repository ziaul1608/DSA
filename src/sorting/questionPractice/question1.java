package sorting.questionPractice;

public class question1 {
    static void sort(String[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i].compareTo(arr[j]) > 0 ) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        String[] arr = {"papaya", "lime", "watermelon", "apple", "mango", "kiwi"};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
