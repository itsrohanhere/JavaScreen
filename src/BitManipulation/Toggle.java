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

    public static void main(String[] args) {
        // toggle krna hai ji
        // 0 hai to 1 aur 1 hai to 0
        toggle(35,4);
        unset(35,4);
    }
}
