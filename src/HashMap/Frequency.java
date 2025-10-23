package HashMap;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Frequency {
    public static void main(String[] args) {
        // count the frequency of elements
        
        List<Integer> list = Arrays.asList(1,2,4,5,2,3,6,5,8,4,5,2,1,4,5,3,5,6,2);
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
        }
        System.out.println(map);

        // finding the maximum frequency and the minimum frequency
        int maxFreq = -1;
        int MinFreq = Integer.MAX_VALUE;
        for (Integer key : map.keySet()) {
            if(map.get(key) > maxFreq){
                maxFreq = map.get(key);
            }
            if(map.get(key) < MinFreq){
                MinFreq = map.get(key);
            }
        }
        System.out.println("Max Frequency = " + maxFreq
        + " Min Frequency = " + MinFreq);

    }
}
