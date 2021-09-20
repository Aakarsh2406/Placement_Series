package Patterns;

import java.util.Scanner;

public class pat2 {
    static  void DigitReverseOrderPat(int n)
    {
        for(int i=n; i>=1;i--)
        {
            for (int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        DigitReverseOrderPat(in.nextInt());
    }
}
