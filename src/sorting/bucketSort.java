package sorting;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    static void bucketSorting(float[] arr) {
        int n = arr.length;

        //buckets
        ArrayList<Float>[] buckets = new ArrayList[n];

        //create empty buckets
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        //add elements into our buckets
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) arr[i] * n;
            buckets[bucketIdx].add(arr[i]);
        }

        //sort each buckets individually
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        //merge all buckets to get final sorted array
        int idx = 0;
        for (int i = 0; i < buckets.length; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[idx++] = currBucket.get(j);
            }
        }
    }
    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        bucketSorting(arr);
        for(float val: arr) {
            System.out.print(val + " ");
        }
    }
}
