package Patterns;

import java.util.Scanner;

public class pat1 {
    static void DigitPat(int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j);

        }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        DigitPat(n);
    }
}
