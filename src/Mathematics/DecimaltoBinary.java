package Mathematics;

public class DecimaltoBinary {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(253));
        System.out.println(decimalBinary(253));
    }
    static int decimalBinary(int decimalNum){
        int resNum = 0;
        int power = 0;
        while(decimalNum!=0){
            int rem =  decimalNum%2;
            decimalNum /=2;
            resNum += rem * Math.pow(10,power);
            power++;
        }
        return resNum;
    }
}


