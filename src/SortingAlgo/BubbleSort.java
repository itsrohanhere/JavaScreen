package SortingAlgo;



public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,8,6,9,7,1,3,2,0};

        bubbleSort(arr);


    }
    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {

            for(int j = 0; j < arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int element : arr) {
            System.out.println(element);
        }
    }

}
