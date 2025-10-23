package Array;

import java.util.*;
public class Search {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be searched ");
        int n = sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(i==n){
                System.out.println("Got the element "+n+" at index "+i);
                return;
            }

        }
        System.out.println("Got no element "+n);

    }
}

