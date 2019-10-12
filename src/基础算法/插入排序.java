package 基础算法;

import java.util.Arrays;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 1, 0, 43, 232};
        charu(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void charu(int[] arr) {
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < arr[i - 1]) {
                int temp = arr[i];
                int j;
                for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[j + 1] = temp;

            }
        }

    }
}
