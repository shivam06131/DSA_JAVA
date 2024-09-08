package ArrayHard;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSumFromSubarr {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        maxSum(arr);
    }

    static int maxSum(int[] nums){
       int maxSum = Integer.MIN_VALUE;


        int[] result = mergeSort(nums, 0 , nums.length);
        System.out.println("Sorted " + Arrays.toString(result));


        return maxSum;
    }

    static int[] mergeSort(int[] nums, int start ,int end){
        if(start >= end){
            return nums;
        }
        System.out.println("start end " + start + " " + end);

        int mid = (end + start) / 2;
        mergeSort(nums, start , mid);
        mergeSort(nums,mid+1, end);
        return merge(nums, start , mid , end);
    }

    static int[] merge(int[] nums, int start, int mid ,int end){

        int[] temp = new int[end];
        int tempInd = 0;

        //Compare and add.
        while (start < mid && mid + 1 < end){
            System.out.println("values " + start + " mid " + mid + " end " + end);
            System.out.println("Array : " + Arrays.toString(nums));
            if(nums[start] < nums[mid]){
                temp[tempInd] = nums[start];
                start++;
            }else if (mid + 1 < end){
                temp[tempInd] = nums[mid + 1];
                mid++;
            } else {
                temp[tempInd] = nums[start];
                start++;
            }
            tempInd++;
        }

        if(start < mid){
            for(int i = start;i<=mid;i++){
                temp[tempInd] = nums[i];
                start++;
                tempInd++;
            }
        }

        if(mid + 1 < end){
            for(int i = mid + 1;i<=end;i++){
                temp[tempInd] = nums[mid + 1];
                start++;
                tempInd++;
            }
        }
        //Dump to nums
        //        System.arraycopy(temp, 0, nums, 0, temp.length);
        for(int i=0;i<temp.length;i++){
            nums[i] = temp[i];
        }

        return nums;
    }
}
