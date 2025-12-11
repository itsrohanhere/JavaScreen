package Mathematics;

public class thirdMax {

    public static void main(String[] args) {
        // in this program we are finding the third largest element in the array
        // this code is for finding the distinct elements

        int arr[] = {855,450,132, 359, 233, 825, 604, 481, 262, 337, 720, 525, 652, 300, 906, 219, 926, 906, 293, 864, 817, 498, 30, 639, 661};
        System.out.println(thirdLargest(arr));

    }
    static int thirdLargest(int arr[]) {
        // Your code here
        int max = -1;
        int secMax = -1;
        int thirdMax = -1;
        int index = 0;

        while (index < arr.length) {
            if (arr[index] > max) {
                thirdMax = secMax;
                secMax = max;
                max = arr[index];
            }

            if (arr[index] > secMax && arr[index] < max) {
                thirdMax = secMax;
                secMax = arr[index];
            }

            if (arr[index] > thirdMax && arr[index] < secMax) {
                thirdMax = arr[index];
            }

            index += 1;
        }
        return thirdMax;
    }
}
