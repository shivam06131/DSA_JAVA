package ArrayPart2;

import java.util.*;

public class countInversion {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4};
        int value = mergeSort(nums,0,nums.length-1);
        System.out.println("count " + value);
    };

    static int mergeSort(int[] arr, int start, int end){
        if(start >= end){
            return 0;
        };
        int count = 0;
        int mid = (end + start)/2;
        count += mergeSort(arr, start,mid);
        count += mergeSort(arr,mid+1,end);
        count += merge(arr,start,mid,end);
        return count;
    }

    static int merge(int[] arr, int start,int mid, int end){
        //Create temp arr.
        ArrayList<Integer> temp = new ArrayList<>();
        int left = start;
        int right = mid + 1;
        int count = 0;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                count += (mid - left + 1);
                right++;
            }
        }

        if(left <= mid){
            for (int i=left;i<=mid;i++){
                temp.add(arr[i]);
            }
        }

        if(right <= end){
            for(int i=right;i<=end;i++){
                temp.add(arr[i]);
            }
        }

        //Dump data //start = 5 , end = 8 (get (i-start) => 5 - 5 => 0, 6 - 5 = 1, 7 - 5 = 2)
        for(int i=start;i<=end;i++){
            arr[i] = temp.get(i - start);
        }

        return count;
    }
}
