package BitManipulation;

public class PrintingBinaryDigits {
    public static void main(String[] args) {
        int a = 35;
        int digit = 8;
        int count = 0;
        while(digit >= 0){
            System.out.print(1&(a >> digit));
            digit -= 1;
            count++;


        }
        System.out.println("");
        System.out.println(count);
    }
}
