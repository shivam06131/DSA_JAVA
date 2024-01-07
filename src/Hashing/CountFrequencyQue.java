package Hashing;

import java.util.Arrays;

public class CountFrequencyQue {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 9, 2, 7};
        int[] arr = countFrequency(6 , 9 , array);
        System.out.println(Arrays.toString(arr));
    };

    public static int[] countFrequency(int n, int x, int []nums){
        // Write your code here.
        int[] arr = new int[x + 1];

        for(int i : nums){
            arr[i] = arr[i] + 1;
        }

        int[] newArr = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            newArr[i] = arr[i];
        }

        return newArr;

    }
}
