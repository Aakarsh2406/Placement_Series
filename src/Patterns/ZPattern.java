package Patterns;

import java.util.Scanner;

public class ZPattern {
    static void Zpat(int n) {
        int d=n-1;
        for (int i = 1; i <= n; i++) { // first line
            System.out.print(i + " ");
        }
        System.out.println("");
        for (int i = n-2; i >0 ; i--) { // diagonal
            for (int j = i; j >0 ; j--) {
                System.out.print("  ");

            }
            System.out.print(d--);

            System.out.println("");
        }
        for (int i = 1; i <=n ; i++) { // second line
            System.out.print(i+" ");

        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Zpat(n);
    }
}
