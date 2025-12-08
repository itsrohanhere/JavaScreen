package Mathematics;

public class Prime {
    public static void main(String[] args) {
        checkPrime(7);

    }
    static void checkPrime(int number){
        for(int i =2; i*i <= number; i++){
            if(number%i==0){
                System.out.println(number+" is not a prime number");
                return;

            }
        }
        System.out.println(number+" is a prime number");
    }
}
