package Array4;

import java.util.HashMap;

public class SubWithGivenZor {
    public static void main(String[] args) {

        int[] nums = {4,2,2,6,4};
        int[] nums2 = {5, 6, 7, 8, 9};
        int result = calculateXorCount(nums,6);
//        int result = calculateXorCount(nums2,5);
        System.out.println("result " + result);
    }

    static int calculateXorCount(int[] nums, int k){
        int count=0;
        HashMap<Integer,Integer> hash = new HashMap<>();
        int xorSum = 0;
        hash.put(0,1);

        for (int i : nums){
            xorSum ^= i;

            int findVal = xorSum ^ k;
            if (hash.containsKey(findVal)){
                count += hash.get(findVal);  // Add the number of occurrences
            }

            // Update the map with the current xorSum
            hash.put(xorSum, hash.getOrDefault(xorSum, 0) + 1);
        }

        return count;
    }
}
