package DP;

import java.util.Scanner;

public class Climb_stairs {
    public static int fibNo(int n) {
        int arr[] = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i <= n; i++) {

            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }
    public static int climb(int n)
    {
        if(n==1)
            return 1;
        if(n==2)
            return 2;
        return fibNo(n+1);

    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int n= in.nextInt();// enter number
        System.out.println( climb(n));
    }
}