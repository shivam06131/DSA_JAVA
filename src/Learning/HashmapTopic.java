package Learning;

import java.util.HashMap;
import java.util.Map;

public class HashmapTopic {
    public static void main(String[] args) {
        int result = 0;
        int[] nums = {4,1,2,1,2};
        for(int n : nums){
            result ^= n;
        }

        System.out.println("result : " + result);

    }
}
