package Mathematics;

public class ArmStrongNumber {
    public static void main(String[] args) {
        isArmStrongNumber(12521);
    }
    static void isArmStrongNumber(int number) {
        int num = number;
        int rev = 0;
        while(num != 0){
            rev = rev*10 + num%10;
            num /= 10;
        }
        System.out.println(number == rev);
    }
}
