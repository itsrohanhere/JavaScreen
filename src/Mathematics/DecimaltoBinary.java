package Mathematics;

public class DecimaltoBinary {
    public static void main(String[] args) {
//        System.out.println(Integer.toBinaryString(253));
//        System.out.println(decimalBinary(1632));
        binaryPalindrome(91);
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

    static void binaryPalindrome(int num){
        StringBuilder sb = new StringBuilder(decimalBinary(num));
        StringBuilder sb2 = new StringBuilder(sb.reverse().toString());
//        System.out.println(sb.reverse().toString());
        String two = sb.toString();
        String one = sb.reverse().toString();

        System.out.println(one.equals(two));
    }
}


