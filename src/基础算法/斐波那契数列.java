package 基础算法;

public class 斐波那契数列 {
    public static void main(String[] args) {
        int i = feibo(6);
        System.out.println(i);
    }


    //1  1  2  3  5  8
    public static int feibo(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            return feibo(a - 1) + feibo(a - 2);
        }
    }
}
