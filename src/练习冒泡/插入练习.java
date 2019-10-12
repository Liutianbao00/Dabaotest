package 练习冒泡;

import java.util.Arrays;

public class 插入练习 {
    public static void main(String[] args) {
        int[] arr = {44, 66, 88, 22, 11, 99, 77, 0};
//        maopao(arr);
//        quickSort(arr,0,arr.length-1);
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
