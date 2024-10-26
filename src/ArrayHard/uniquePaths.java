package ArrayHard;

public class uniquePaths {
    public static void main(String[] args) {
        int result = findMoves(3, 7);
        System.out.println("Result => " + result);
    }

    static int findMoves(int m, int n){
        int[][] dp = new int[m][n];

        return paths(0,0,m-1,n-1,dp);
    }

    static int paths(int i,int j,int m,int n, int[][] dp){
        if(i > m || j > n) return 0;

        if(i == m && j == n) return 1;

        dp[i][j] = paths(i+1,j,m,n,dp) + paths(i,j+1,m,n,dp);

        return dp[i][j];

    }


}
