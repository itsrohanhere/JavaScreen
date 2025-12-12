package BitManipulation;

public class SetBit {
    static void setBit(int num,int bit){
        System.out.println(IsBitSet.isBitSet(num,bit));
        num = num | (1<< bit);
        System.out.println(IsBitSet.isBitSet(num,bit));
        System.out.println(num);

    }
    public static void main(String[] args) {
        setBit(35,4);
    }
}
