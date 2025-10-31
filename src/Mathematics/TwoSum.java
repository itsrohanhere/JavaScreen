package Mathematics;

import java.util.ArrayList;
import java.util.HashMap;

public class TwoSum {

    static ArrayList<Integer> twoSum(int[] numbers, int target) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for (int i = 0; i < numbers.length; i++) {

            if(map.containsKey(target-numbers[i])){
                list.add(i);
                list.add(map.get(target-numbers[i]));

                return list;
            }else{
                map.put(numbers[i],i);
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int arr[] = {1,23,5,21,65,85,91,17,24,35};

//        int result[] = twoSum(arr, 66);
//        for(int ele : result){
//            System.out.println(ele);
//        }
    }
}
