package BitManipulation;

public class Toggle {
    static void toggle(int n, int bit){
        int num = n ^ (1<<bit);
        System.out.println(num);
    }

    public static void main(String[] args) {
        // toggle krna hai ji
        // 0 hai to 1 aur 1 hai to 0
        toggle(35,5);
    }
}
