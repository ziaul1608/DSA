package sorting;

public class quickSort {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        int pivot = arr[st];
        int cnt = 0;
        for (int i = st+1; i <= end; i++) {
            if(arr[i] <= pivot) cnt++;
        }
        int pivotIdx = st + cnt;
        swap(arr, st, pivotIdx);

        int i = st, j = end;

        //elements lesser than pivot will come to its left and greater than pivot will come to its right
        while(i < pivotIdx && j > pivotIdx) {
            while(arr[i] <= pivot) i++; //skipping the elements which doesn't need to be sorted
            while(arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    static void quickSorting(int[] arr, int st, int end) {
        if(st >= end) return;

        int pi = partition(arr, st, end);
        quickSorting(arr, st, pi-1);
        quickSorting(arr, pi+1, end);
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 1, 2, 5};
        int n = arr.length;
        quickSorting(arr, 0, n-1);
        for(int i = 0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
