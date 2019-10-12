package 基础算法;

import java.util.Arrays;

public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 2, 1, 54, 3223};
        xuanze(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void xuanze(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int mindex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mindex]) {
                    mindex = j;
                }
            }
            if (i != mindex) {
                int temp = arr[i];
                arr[i] = arr[mindex];
                arr[mindex] = temp;
            }
        }
    }
}
