package ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;

public class PascalTriangle {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> result = doPascalTriangle(5);
    }

    static ArrayList<ArrayList<Integer>> doPascalTriangle(int row){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for(int i=0;i<row;i++){

            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }else {
                    temp.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(temp);
        }

        System.out.println("Matrix " + result);

        return result;
    }
}
