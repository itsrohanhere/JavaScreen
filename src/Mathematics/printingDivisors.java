package Mathematics;

import java.util.ArrayList;
import java.util.Collections;

public class printingDivisors {
    public static void main(String[] args) {
        divisors(36);
    }
    static void divisors(int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i*i <= number; i++) {
            if (number % i == 0) {
                list.add(i);
                if(number/i != i){
                    list.add(number/i);
                }
            }
        }
        Collections.sort(list);
        for(Integer i:list){
            System.out.println(i);
        }
    }
}
