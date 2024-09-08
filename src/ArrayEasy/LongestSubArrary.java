package ArrayEasy;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrary {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
        int k = 15;

        int val = longestSubArray(arr,k);
        System.out.println("value " + val);
    }

    static int longestSubArray(int[] arr, int k) {
        int longest = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            // If the sum is equal to k, update longest
            if (sum == k) {
                longest = i + 1;
            }

            // Check if sum - k is already present in the map
            if (map.containsKey(sum - k)) {
                longest = Math.max(longest, i - map.get(sum - k));
            }

            // Add sum to the map if it is not already present
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        return longest;
    }
}
