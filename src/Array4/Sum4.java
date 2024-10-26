package Array4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public static void main(String[] args) {

        int[] nums = {1,0,-1,0,-2,2};
        List<List<Integer>> value = find4SumCount(nums,0);

        for (int i=0;i<value.size();i++){
            for (int j=0;j<value.get(i).size();j++){
                System.out.print(value.get(i).get(j) + " , ");
            }
            System.out.println("");
        }


    }
    public static List<List<Integer>> find4SumCount(int[] nums, int target){
        //sort
        //2 for loops from start and start + 1;
        //2 pointers from start + 2 & nums.length - 1;
        //Skip same items from all loops;
        Arrays.sort(nums);
        List<List<Integer>> temp = new ArrayList<>();

        for(int i=0;i<nums.length-3;i++){
            //Skip other code execution if duplicate elements are found;
            if(i > 0 && nums[i] == nums[i-1]) continue;

            for(int j=i+1;j<nums.length-2;j++){
                //Skip other code execution if duplicate elements are found;
                int k=j+1;
                int l=nums.length -1;

                if(j > 1 && nums[j] == nums[j-1]) continue;

                while (k < l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];

                    if(sum == target){
                        List<Integer> tempList = new ArrayList<>();
                        tempList.add(nums[i]);
                        tempList.add(nums[j]);
                        tempList.add(nums[k]);
                        tempList.add(nums[l]);
//                        temp.add({nums[i],nums[j],nums[k],nums[l]});
                        temp.add(tempList);
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1]) l--;


                    }else if(sum < target){
                        k++;
                    }else{
                        l--;
                    }


                }

            }
        }


//        return temp.toArray(new int[temp.size()][]);
        return temp;
    }
}
