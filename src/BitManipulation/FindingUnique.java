package BitManipulation;

public class FindingUnique {
    public static void main(String[] args) {
        // finding unique elements from an array
        int[] arr = {5,6,5,6,7,7,4,5,6,7};
        int a=0;
        int index = 0;
        while(index<arr.length){
            a = a^arr[index];
            index++;
        }
        System.out.println(a);
    }
}
