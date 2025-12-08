package Mathematics;

public class Palindrome {
    public static void main(String[] args) {
        isPalindrome(1211);
    }
    static void isPalindrome(int number) {
        int num = number;
        int reverse = 0;
        while(num!=0){
            reverse = reverse * 10 + num%10;
            num = num/10;
        }
        System.out.println(reverse==number);
    }
}
