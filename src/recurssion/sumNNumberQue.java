package recurssion;

public class sumNNumberQue {
    public static void main(String[] args) {

        long n = 12546546;

        System.out.println("math max " + Integer.MAX_VALUE);

        long sum = 0;
        long ans =  sumNum(1, n, sum);
        System.out.println("Ans " + ans);

    }

    static long sumNum(long i , long n, long sum){
        if(n <= 0) return 0;

        if(i > n){
            sum += n;
            return sum;
        };

        System.out.println("sum here i: " + i + " n: " + n + " sum : " + sum);

        sum += i;
        return sumNum(i+1, n,sum);
    }
}
