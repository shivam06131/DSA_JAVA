package Array4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestConsequetiveSequence {
    public static void main(String[] args) {

        int[] nums = {100,4,200,1,3,2};
        int result = findSequence(nums);
        System.out.println("Result => " + result);
    }

    static int findSequence(int[] nums){
        int globalCont = 0;
        Set<Integer> hash = new HashSet<>();

        for (int num : nums) {
            hash.add(num);
        }

        for(int i=0;i<nums.length;i++){
            int count = 1;
            int element = nums[i];

            if(!hash.contains(element- 1)){
                //Directly check next element, and use count = 1 (using current element in counting and next will be 2)
                while (hash.contains(element + 1)){
                    element += 1;
                    count++;
                }
            }
            globalCont = Math.max(count,globalCont);
        }


        return globalCont;
    }
}
