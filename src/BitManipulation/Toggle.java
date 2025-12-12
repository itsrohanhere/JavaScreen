package BitManipulation;

public class Toggle {
    static void unset(int num, int bit){
        int n = num & (~(1 << bit));
        System.out.println(n);
    }
    static void toggle(int n, int bit){
        int num = n ^ (1<<bit);
        System.out.println(num);
    }

    static void powerOfTwo(int n){
        if((n & (n-1))==0){
            System.out.println(n+" is a power of two");
        }else{
            System.out.println(n+" is not a power of two");
        }
    }

    public static void main(String[] args) {
        // toggle krna hai ji
        // 0 hai to 1 aur 1 hai to 0
//        toggle(35,4);
//        unset(35,4);
        powerOfTwo(8);
    }
}
