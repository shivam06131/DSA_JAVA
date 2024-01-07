package Hashing;

import java.util.HashMap;
import java.util.Map;

public class LowHighFrequency {
    public static void main(String[] args) {

    };

    public static int[] getFrequencies(int []v) {
        // Write Your Code Here
        int[] returnedArr = new int[2];
        Map<Integer , Integer> map = new HashMap<>();
        int globalMax = Integer.MIN_VALUE;
        int globalMin = Integer.MAX_VALUE;

        int maxInt = 0;
        int minInt = 0;

        for(int i : v){

            int val = map.getOrDefault(i , 0);

            if(val > maxInt){

            }

        }


        return returnedArr;
    }
}
