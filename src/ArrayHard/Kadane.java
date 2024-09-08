package ArrayHard;

public class Kadane {
    public static void main(String[] args) {

        int[] nums = {-2, 1};
        int val = maxSubArray(nums);
        System.out.println(val);
    }

    public static int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(i > 0 && sum <= 0){
                sum = 0;
                max = nums[i];
            }else{
                if(sum > max){
                    max = sum;
                }
            }
        }

        return max;
    }
}
