package Patterns;

import java.util.Scanner;

public class pat3 {
    static void IncreasingDigitPat(int n)
    {
        int k=1;
        for (int i=1;i<=n;i++)
        {
            for (int j = 1; j <=i; j++) {
                System.out.print(k++ +" ");


            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        IncreasingDigitPat(in.nextInt());
    }
}
