package recurssion;

import java.util.HashMap;
import java.util.Map;

public class FactorialQue {
    public static void main(String[] args) {
        int fact = factorial(1, 5 , 1);
        System.out.println("Factorial " + fact);

    }

    static int factorial(int i , int n , int sum){
        if(i == n){
            return sum * i;
        }
        sum *= i;

        return factorial(i+1 , n , sum);
    }
}
