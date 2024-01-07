public class IsPalindromeQue {
    public static void main(String[] args) {
        boolean palin = isPalindrome(-101);
        System.out.println("Palindrome : " + palin);
    }

    static boolean isPalindrome(int n) {

        int reversed = reverse(n);

        if (reversed != n) {
            return false;
        }
        return true;
    }

    static int reverse(int n) {
        long reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        return (Integer.MIN_VALUE > reverse || Integer.MAX_VALUE < reverse) ? 0 : (int) reverse;
    }
}
