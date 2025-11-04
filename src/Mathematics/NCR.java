package Mathematics;

public class NCR {
    static int ncr(int n, int r){
        // bi nomial coefficient formula
        int sum = 1;
        int a = n-r;
        for(int i = 1; i <= r; i++){
            sum = sum*(a+i)/i;
        }
        return sum;
    }
    static int nCr(int n, int r){
        // this is an recursive function
        // checking invalid condition
        if(n<r) return 0;

        // base case
        if(n==r || r==0) return 1;

        return nCr(n-1,r-1)+nCr(n-1,r);
    }


    public static void main(String[] args) {
        // number of total combination
        int n = 3;
        // number of combination
        int r = 5;
        System.out.println(nCr(n,r));
        System.out.println(ncr(n,r));


    }
}
