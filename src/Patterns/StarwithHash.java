package Patterns;

import java.util.Scanner;

public class StarwithHash {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for (int i= row-1; i>=0; i--)
        {
            for (int j=row; j>i;j--)
            {
                System.out.print("*");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print("#");
            }
            System.out.println("");
        }

    }
}
