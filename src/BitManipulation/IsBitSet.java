package BitManipulation;

public class IsBitSet {
    static void isBitSet(int num, int bit) {
        if((1&(num >> bit))==1){
            System.out.println(" the bit is set 1 ");
        }else{
            System.out.println(" the bit is set 0 ");
        }
    }
    public static void main(String[] args) {
        isBitSet(35,4);
    }
}
