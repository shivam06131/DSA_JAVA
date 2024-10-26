package Array4;

import java.util.HashMap;

public class LongestSubarray {
    public static void main(String[] args) {
        int[] nums = {15,-2,2,-8,1,7,10,23};
        int result = findLongestSubArray(nums);
        System.out.println("Result " + result);
    }

    static int findLongestSubArray(int[] nums){
        int localLength;
        int maxLength = 0;
        int sum = 0;
        HashMap<Integer,Integer> hash = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            sum += nums[i];

            if(hash.containsKey(sum)){
                localLength = i - hash.get(sum);
                maxLength = Math.max(localLength, maxLength);
            }else{
                hash.put(sum,i);
            }
        }

        System.out.println("hash " + hash);
        return maxLength;
    }
}
