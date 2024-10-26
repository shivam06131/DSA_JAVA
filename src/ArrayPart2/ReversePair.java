package ArrayPart2;

import java.util.ArrayList;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,3,2,3,1};
        int result = reversePairs(nums);
        System.out.println("Result " + result);
    }
    public static int reversePairs(int[] nums) {
        int val = mergeSort(nums, new int[nums.length], 0, nums.length - 1);
        return val;
    }

    static int mergeSort(int[] arr, int[] temp, int start, int end) {
        int count = 0;
        if (start < end) {
            int mid = (start + end) / 2;

            // Count inversions in the left half
            count += mergeSort(arr, temp, start, mid);

            // Count inversions in the right half
            count += mergeSort(arr, temp, mid + 1, end);

            // Count inversions while merging the two halves
            count += merge(arr, temp, start, mid, end);
        }
        return count;
    }

    static int merge(int[] arr, int[] temp, int start, int mid, int end) {
        int left = start, right = mid + 1, index = start;
        int count = 0;

        for (int i = left; i <= mid; i++) {
            while (right <= end && arr[i] > (2L * arr[right])) {
                right++;
            }
            count += (right - (mid + 1));
        }

        right = mid + 1;

        // Merge the two halves while counting inversions
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];

            }
        }

        // Copy the remaining elements from the left half, if any
        while (left <= mid) {
            temp[index++] = arr[left++];
        }

        // Copy the remaining elements from the right half, if any
        while (right <= end) {
            temp[index++] = arr[right++];
        }

        // Copy the merged subarray back into the original array
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }

        return count;
    }

}