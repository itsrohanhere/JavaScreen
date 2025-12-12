package BitManipulation;

public class IsBitSet {
    static String isBitSet(int num, int bit) {
        if((1&(num >> bit))==1){
            return " the bit is set 1 ";
        }
        return " the bit is set 0 ";
    }
    public static void main(String[] args) {
        isBitSet(35,4);
    }
}
