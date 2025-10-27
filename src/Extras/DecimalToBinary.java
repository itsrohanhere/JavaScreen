package Extras;

public class DecimalToBinary {
    static void decimalToBinary_three(int num) {
        // using bit wise operator

        StringBuffer sb = new StringBuffer();
        while(num>0){
            sb.append(num & 1);
            num >>= 1;
        }
        System.out.println(sb.reverse());
    }
    static  void decToBinary_twoo(int num, StringBuilder bin){
        // using recursion
        // base case
        if(num==0){
            return;
        }

        // calling the function
        decToBinary_twoo(num/2,bin);


        // appending the number to string
        bin.append(num%2);

    }
    static String decToBinary_two(int n) {
        if (n == 0)
            return "0";

        StringBuilder bin = new StringBuilder();
        decToBinary_twoo(n, bin);
        return bin.toString();
    }
    static void decToBinary_one(int num) {

        StringBuffer sb = new StringBuffer();
        while(num > 0){
            int bin = num%2;
            sb.append((char)('0'+bin));
            num = num/2;
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String[] args) {
        int number = 12;
        decimalToBinary_three(number);
    }
}
