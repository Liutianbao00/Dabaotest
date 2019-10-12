package 练习冒泡;

import java.util.Arrays;

public class 冒泡练习 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 3, 0, 32, 34, 45, 555};
        maopao(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void maopao(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


}
