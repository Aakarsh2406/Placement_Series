package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class WIPRO {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int arr[]=new int[n];
        int arr1[]=new int[n+1];
        for (int i = 0; i < n; i++) {
            arr[i]=in.nextInt();
        }

        for (int i:arr
             ) {
            arr1[i]++;
        }
        int max=0;
        int i;
        for (i = 0; i < arr1.length-1; i++) {

            if(arr1[i]>max)
                max=arr[i];
        }
        int p=0,o=0;
        for (int j = 0; j < arr1.length; j++) {
            if(arr1[j]==max)
            {
                p=j;
                o=j;
            }


        }
        System.out.println(Math.max(p,o));





    }
}
