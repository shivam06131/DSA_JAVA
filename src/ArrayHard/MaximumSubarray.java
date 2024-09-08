package ArrayHard;

public class MaximumSubarray {
    public static void main(String[] args) {

        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int[] arr2 = {5,4,-1,7,8};
        int result = maxSubArray(arr2);
        System.out.println("Result " + result);
    }

    public static int maxSubArray(int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        int sum = 0;

        for(int i=0;i<arr.length;i++){
            sum+= arr[i];

            if(sum < 0){
                sum = 0;
            }else{
                maxVal = Math.max(maxVal , sum);
            }
        };

        return maxVal;
    }
}
