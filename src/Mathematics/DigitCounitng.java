package Mathematics;

public class DigitCounitng {
    public static void main(String[] args) {
        countDigits(142536);
    }
    static void countDigits(int number){

        int digit = (int)(Math.log(number)/Math.log(10)+1);
        System.out.println(digit+" digits are in the given number "+ number);
    }
}
