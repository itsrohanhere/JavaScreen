package Mathematics;

public class FindingLCM {

    static int lcm_formula(int a,int b){
        return a*(b/FindingGCD.optimized_euc(a,b));
    }

    static int lcm(int a,int b){
        int big = Math.max(a,b);
        int small = Math.min(a,b);
        for(int k=big;k<a*b;k++){
            if(k%small==0){
                return k;
            }
        }
        return a*b;
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(lcm_formula(a,b));

    }
}
