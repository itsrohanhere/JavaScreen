package Array;

//pring only negative numbers in an given array
class Negative{
    public static void main(String[]args){
        int[] arr = {10,25,-7,8,-6,-2};

        // printing elements with for loop;
        for(int i=0; i<arr.length;i++){
            if(arr[i]<0)
                System.out.print(arr[i]+" ");
        }
    }
}