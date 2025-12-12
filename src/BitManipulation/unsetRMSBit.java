package BitManipulation;

public class unsetRMSBit {
    static void unsetRightMostSetBit(int num){
        int n = num & num-1;
        System.out.println(n);
    }
    static void countSetBits(int num ){
        int count = 0;
        while(num != 0){
            count += 1;
            num = num & num-1;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
//        PrintingBinaryDigits.
//        unsetRightMostSetBit(48);
        countSetBits(47);
    }
}
