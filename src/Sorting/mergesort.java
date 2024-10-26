package Sorting;

import java.util.ArrayList;

public class mergesort {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4};

        mergeSort(nums, 0 , nums.length - 1);
        for (int i : nums){
            System.out.println(i);
        }
    }

    static void mergeSort(int[] nums, int start, int end){
        if(start >= end) return;

        int mid = (start + end) / 2;
        mergeSort(nums,start,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,start,mid,end);
    }

    static void merge(int[] nums, int start, int mid, int end){
        ArrayList<Integer> tempArr = new ArrayList<>();
        int rightFirst = mid + 1;
        int leftFirst = start;

        while(leftFirst <= mid && rightFirst <= end){
            if(nums[leftFirst] < nums[rightFirst]){
                tempArr.add(nums[leftFirst]);
                leftFirst++;
            }else{
                tempArr.add(nums[rightFirst]);
                rightFirst++;
            }
        }

        //dump first half
        if(leftFirst <= mid){
            for (int i=leftFirst;i<=mid;i++){
                tempArr.add(nums[i]);
            }
        }

        //dump second half
        if(rightFirst <= end){
            for (int i=rightFirst;i<=end;i++){
                tempArr.add(nums[i]);
            }
        }

        // Copy the sorted elements back into the original array
        for (int i = 0; i < tempArr.size(); i++) {
            nums[start + i] = tempArr.get(i);
        }
    }
}
