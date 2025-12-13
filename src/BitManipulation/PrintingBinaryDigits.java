package BitManipulation;

public class PrintingBinaryDigits {
    static void clearLSB(int num,int bit){
        int n = num & (~((1<<bit+1)-1));
        printBits(n);
    }
    static void clearMSB(int num,int bit){
        int n = num & (((1<<bit)-1));
        printBits(n);
    }
    static void clearMSBexclusive(int num,int bit){
        int n = num & (((1<<bit+1)-1));
        printBits(n);
    }
    static void printBits(int num){
        int digit = 8;

        while(digit >= 0){
            System.out.print(1&(num >> digit));
            digit -= 1;



        }
        System.out.println("");
    }
    public static void main(String[] args) {
        printBits(47);
        clearMSB(47,2);


    }
}
