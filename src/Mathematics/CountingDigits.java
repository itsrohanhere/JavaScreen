package Mathematics;

public class CountingDigits {

    static int countDigits(int num,int target){
        // converting the number to a string for an efficient use
        String numberStr = Integer.toString(num);
        int count = 0;
        for(int i=0;i<numberStr.length();i++){
            char  c = numberStr.charAt(i);

            // converting char to integer

            int digit = Character.getNumericValue(c);

            if(digit==target){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int number = 5455415;
        int digitToCount = 5;
        System.out.println(countDigits(number,digitToCount));
    }
}
