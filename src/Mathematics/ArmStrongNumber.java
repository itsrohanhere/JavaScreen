package Mathematics;

public class ArmStrongNumber {
    public static void main(String[] args) {
        isArmStrongNumber(153);
    }
    static void isArmStrongNumber(int number) {
        int num = number;
        int arm = 0;
        while(num != 0){
            int digit = num%10;
            arm += digit*digit*digit;
            num /= 10;
        }
        System.out.println(number == arm);
    }
}
