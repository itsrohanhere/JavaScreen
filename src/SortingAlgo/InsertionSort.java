package SortingAlgo;



public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,8,6,9,7,1,3,2,0};

        insertionSort(arr);


    }
    static void insertionSort(int[] arr) {
        for(int i = 1; i <= arr.length-1; i++){

            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }

        }
        for(int element : arr) {
            System.out.println(element);
        }
    }

}
