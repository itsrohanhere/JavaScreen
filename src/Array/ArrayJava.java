package Array;

import java.util.*;

class ArrayJava
{
	public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0; i<10;i++){
            arr[i] = sc.nextInt();
        }
        for(int j=0; j<arr.length;j++){
            System.out.print(arr[j]+" ");
        }
    }
}