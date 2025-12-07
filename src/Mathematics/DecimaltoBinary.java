package Mathematics;

public class DecimaltoBinary {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(253));
        System.out.println(decimalBinary(1632));
    }
    static String decimalBinary(int decimalNum){
        StringBuilder sb = new StringBuilder();
        while(decimalNum!=0){
            int rem = decimalNum%2;
            sb.append((rem==1)?"1":"0");
            decimalNum = decimalNum/2;
        }
        return sb.reverse().toString();
    }
}


