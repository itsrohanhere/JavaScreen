package Mathematics;

public class DivisibleBy13 {

    static boolean divisibleby13(String number){
        int rem = 0;

        for(int i = 0 ; i < number.length() ; i++){
            rem = (rem*10 + (number.charAt(i) - '0'))%13;
        }

        return rem == 0;
    }


    public static void main(String[] args) {
        String number = "2911285";
        System.out.println(divisibleby13(number));
    }
}
