package Mathematics;

public class BinarytoDecimal {
    public static void main(String[] args) {
        // this is for Integer values
        System.out.println(binaryDecimal("10001110"));
    }
    static int binaryToDecimal(int binaryNum){

        int mul = 0;
        int result = 0;
        while (binaryNum != 0) {
            int digit = binaryNum % 10;
            result += digit * Math.pow(2,mul);
            binaryNum /= 10;
            mul += 1;
        }

        return result;
    }
    static int binaryDecimal(String binaryString){

        StringBuilder sb = new StringBuilder(binaryString);
        int result = 0;
        int power = 0;
        for(int i = sb.length()-1; i >= 0; i--){
            if(sb.charAt(i) == '1'){
                int num = Character.getNumericValue(sb.charAt(i));
                result += num * Math.pow(2,power);
                sb.deleteCharAt(i);
            }
            power += 1;
        }
        return result;
    }

}
