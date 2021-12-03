package DP;

import java.util.Scanner;

public class Tribonacci {
    public  static int triNo(int n)
    {
        int arr[]=new int[n+3];
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for (int i = 3; i <=n ; i++) {

            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n];
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();// enter number
        if(n>0 && n<37) {
            System.out.println(triNo(n));
        }
        else System.out.println("Number not according to constraint");

    }
}
/* Constraints
. 0 <= n <= 37
 */