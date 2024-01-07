package recurssion;

import java.util.Arrays;

public class PrintNumbersNTimeQue {
    public static void main(String[] args) {

        int[] num = new int[5];
        int[] numberArr = printNumber(0,5,num);

        System.out.println(Arrays.toString(numberArr));
    }

    static int[] printNumber(int i , int n , int[] num) {
        if (i == n) {
            return num;
        }

        num[i] = i + 1;
        return printNumber(i + 1, n, num);
    }
}
