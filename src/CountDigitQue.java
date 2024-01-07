public class CountDigitQue {
    public static void main(String[] args) {

        int countedValue = countDigit(123456);
        System.out.println("VALUE: " + countedValue);
    }

    ;

    static int countDigit(double n) {
        double tempn = n;
        int count = 0;

        while (tempn > 0) {
            tempn = Math.floor(tempn / 10);
            count += 1;
        }

        return count;
    }
}
