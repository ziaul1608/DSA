package sorting;

public class bubbleSort {
    static void bubbleSorting(int[] a) {
        int n = a.length;

        for(int i = 0; i < n-1; i++) {
            boolean flag = false;
            //flag variable checks whether swapping has happened
            //if in further code swapping occurs then flag becomes true
            for (int j = 0; j < n-i-1; j++) {
                if(a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    flag = true;
                }
                if(!flag) {
                    return;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,7,3,9,1,6,2,4,8};
        bubbleSorting(arr);
        for (int i = 0; i < 9; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
