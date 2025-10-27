package Extras;

public class SeiveOfEratosthenes {
    static int[] seiveOfEratosthenes(int arr) {
        // making a boolean array so store whether a number is prime or not
        boolean[] prime = new boolean[arr+1];
        // making all the indices of prime array to true with a for loop
        for (int i = 0; i <= arr; i++) {
            prime[i] = true;
        }



        // marking the multiple of number which are lesser than root of the given number to false
        for (int i = 2; i*i <= arr; i++) {
            if (prime[i]) {
                for (int j = i*i; j <= arr; j+=i) {
                    prime[j] = false;
                }
            }
        }


        // counting all the true number from 2 to n
        int count = 0;
        for(int i = 2 ; i < arr; i++){
            if(prime[i]){
                count++;
            }
        }
        // storing all the false from index 2 to n in a array

        int[] result = new int[count];
        int index = 0;
        for(int i = 2 ; i < arr ; i++){
            if(prime[i]){
                result[index++] = i;
            }
        }

        // returning the result array
        return result;
    }
    public static void main(String[] args) {
        int number = 35;
        int[] final_answer =  seiveOfEratosthenes(number);
        for (int i = 0; i < final_answer.length; i++) {
            System.out.println(final_answer[i]);
        }
    }
}
