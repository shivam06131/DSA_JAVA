package ArrayHard;

import java.util.Arrays;

public class SetColor012 {
    public static void main(String[] args) {

        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] nums2 = {1, 2, 0};
        int[] result = sortColors(nums2);
        System.out.println("Result " + Arrays.toString(result));
    }

    static int[] sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int index = 0;

        while (index < nums.length) {
            if (nums[index] == 2) {
                swap(nums, index, end);
                end--;
                index++;
            } else if (nums[index] == 0) {
                swap(nums, index, start);
                start++;
                index++;
            } else {
                index++;
            }
            System.out.println("After swap " + index + " = " + Arrays.toString(nums));
            System.out.println("Start " + start + " end " + end + " index " + index);
            System.out.println("-----------------");
        }

        return nums;
    }

    static void swap(int[] nums, int index1, int index2) {
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
