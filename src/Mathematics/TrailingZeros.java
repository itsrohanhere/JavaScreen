package Mathematics;

public class TrailingZeros {
    public static void main(String[] args) {
        trailingZeros(30);
    }
    static void trailingZeros(int number) {
        int res = 0;
        for(int i = 5; i <= number; i = i*5){
            res = res + (int)Math.floor(number/i);
        }
        System.out.println(res + " zeros are in the factorial of "+ number);
    }
}
