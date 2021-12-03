package DP;

import java.util.Scanner;

public class Fibonaaci {
    public static int fibNo(int n)
    {
        int arr[]=new int[n+2];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=n ; i++) {

            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt(); // enter required number
        System.out.println(fibNo(n));
    }
}
