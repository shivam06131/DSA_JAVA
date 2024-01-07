public class ArmstrongNumberQue {
    public static void main(String[] args) {

        isArmStrong(153);
    }

    static boolean isArmStrong(int n){
        int power = 0;
        int tempn = n;
        int armStrongNo = 0;

        //To calculate the length of number for power
        while(tempn != 0){
            tempn /= 10;
            power += 1;
        };

        tempn = n;
        while(tempn != 0){
            int rem = tempn % 10;
            tempn /= 10;

            armStrongNo+= (int) Math.pow(rem , power);
        }

        System.out.println("armStrongNo => " + armStrongNo);
        return true;
    }
}
