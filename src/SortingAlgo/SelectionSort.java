package SortingAlgo;

import java.sql.SQLOutput;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,8,6,9,7,1,3,2,0};

        selectionSort(arr);


    }
    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 2; i++) {
            int minimum = i;
            for(int j = i; j < arr.length; j++) {
                if(arr[j] < arr[minimum]) minimum = j;
            }
            int temp = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = temp;
        }
        for(int element : arr) {
            System.out.println(element);
        }
    }

}
