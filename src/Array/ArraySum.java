package Array;

import java.util.*;

class ArraySum{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int[] arr = new int[n];
        // take input for the array
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        // printing sum of the array
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        System.out.println("The sum is "+sum);

    }
}