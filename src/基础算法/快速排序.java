package 基础算法;

import java.util.Arrays;

public class 快速排序 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 3, 2, 23};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                if (low < high && arr[high] > stard) {
                    high--;
                }

                arr[low] = arr[high];
                if (low < high && arr[low] < stard) {
                    low++;
                }
                arr[high] = arr[low];


            }
            arr[low] = stard;
            quickSort(arr, start, low);
            quickSort(arr, low + 1, end);
        }
    }
}
