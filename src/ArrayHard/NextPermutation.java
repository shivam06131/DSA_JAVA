package ArrayHard;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        int[] nums = {1,5,3,4};
        int[] nums2 = {3,2,1};
        int[] nums3 = {1,2};
        int[] nums4 = {1,1};
        nextPermutation(nums4);

    }

    public static void nextPermutation(int[] nums) {
            if(nums.length < 2) return;

            //find index where nums[index] < nums[index + 1]
            int index = nums.length - 2;
            while(index >= 0 && nums[index] > nums[index + 1]){
                index--;
            }

            //find indexj where index[j] >= index[i]
            if(index >= 0){
                int indexj = nums.length - 1;
                while (indexj >= 0 && nums[indexj] <= nums[index]){
                    indexj--;
                }

                //swap nums[index] with nums[indexj]
                swap(nums, index ,indexj);
            }

        //Reverse from index+1 -> nums.length - 1;
        reverse(nums,index+1,nums.length - 1);

        System.out.println("Final arr " + Arrays.toString(nums));

    }

    static void reverse(int[] nums , int start, int end){
        while (start < end){
            swap(nums, start++, end--);
        }
    }

    static void swap(int[] nums, int index, int indexj){
        int temp = nums[indexj];
        nums[indexj] = nums[index];
        nums[index] = temp;
    }

}
