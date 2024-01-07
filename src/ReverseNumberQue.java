public class ReverseNumberQue {
    public static void main(String[] args) {

        int reversed = reverseNumber(1147483647);
        System.out.println("reversed => " + reversed);
    }

    ;

    static int reverseNumber(int n) {
        long reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }
        ;

        return (reverse < Integer.MIN_VALUE || reverse > Integer.MAX_VALUE) ? 0 : (int) reverse;
    }
}
