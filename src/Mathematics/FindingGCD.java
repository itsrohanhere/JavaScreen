package Mathematics;
import java.math.BigInteger;

public class FindingGCD {

    static int gcd_built(int a,int b){
        int result = BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
        return result;
    }

    static int optimized_euc(int a, int b){
        return (b==0)?a:optimized_euc(b,a%b);
    }

    static int modified_euc(int a, int b){
        if ( a == 0){
            return b;
        }
        if ( b == 0){
            return a;
        }

        // base case
        if(a==b){
            return a;
        }

        if(a>b){
            if(a%b==0){
                return b;
            }
            return modified_euc(a-b,b);
        }

        if(b%a == 0) {
            return a;
        }

        return modified_euc(a, b-a);


    }

    static int euclidean(int a,int b){
        if(a==b){
            return a;
        }


        if(a>b){
            return euclidean(a-b,a);
        }else{
            return euclidean(a,b-a);
        }
    }

    static int gcd(int a,int b){
        // finding minimum
        int result = Math.min(a,b);
        while(result > 0){
            if(a%result==0 && b%result==0){
                break;

            }
            result--;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        // calling a method to find GCD
        System.out.println(gcd_built(a,b));
    }
}
