public class GcdQue {
    public static void main(String[] args) {

        int gcd = calculateGcd(20, 5);
        System.out.println("GCD : " + gcd);
    }

    static int calculateGcd(int a, int b) {
        int reminder = Integer.MAX_VALUE;

        while (reminder != 0) {
            reminder = a % b;

            a = b;
            b = reminder;
        }

        return a;
    }
}
