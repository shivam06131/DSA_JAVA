package ArrayEasy;

import java.util.ArrayList;

public class Union {
    public static void main(String[] args) {
    int[] arr1 = {-8,-3, -3, -2, 0 ,1, 2, 2, 6};
    int[] arr2 = {-9 ,-9 ,0};

    ArrayList<Integer> val = findUnion(arr1,arr2,9,3);

    for(int i : val){
        System.out.println(i);
    }
    }

    public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m){
        ArrayList<Integer> union = new ArrayList<>();

        int i=0;
        int j=0;

        while(i < n && j < m){
            //Skip duplicates.
            while(i > 0 && i < n && arr1[i] == arr1[i - 1]){
                i++;
            }
            while(j > 0 && j < m && arr2[j] == arr2[j - 1]){
                j++;
            }

            if(arr1[i] > arr2[j]){
                union.add(arr2[j]);
                j++;
            }else if(arr1[i] < arr2[j]){
                union.add(arr1[i]);
                i++;
            }else{
                union.add(arr1[i]);
                i++;
                j++;
            }
        }

        //Add all remaining array items, and also check for duplicates.
        while(i < n){
            if(arr1[i] == arr1[i - 1]){
                i++;
            }else{
                union.add(arr1[i]);
                i++;
            }
        }

        while(j < m){
            if(arr2[j] == arr2[j - 1]){
                j++;
            }else{
                union.add(arr2[j]);
                j++;
            }
        }

        return union;
    }
}
