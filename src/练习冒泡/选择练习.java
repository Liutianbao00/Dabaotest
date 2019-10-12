package 练习冒泡;

import java.util.Arrays;

public class 选择练习 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 3, 2, 1, 54, 3223};
//        xuanze(arr);
//        xuanze(arr);
//                quickSort(arr,0,arr.length-1);
        quickSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}



