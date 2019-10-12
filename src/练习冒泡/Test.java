package 练习冒泡;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {33, 66, 88, 33, 11, 22, 99, 88, 666};
        maopao(arr, 0, arr.length - 1);
//        maopao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void maopao(int[] arr, int start, int end) {
        if (start < end) {
            int stard = arr[start];
            int low = start;
            int high = end;
            while (low < high) {
                if (low < high && arr[high] >= stard) {
                    high--;
                }
                arr[low] = arr[high];
                if (low < high && arr[low] <= stard) {
                    low++;
                }
                arr[high] = arr[low];
            }
            arr[low] = stard;
            maopao(arr, start, low);
            maopao(arr, low + 1, end);
        }

    }
}
