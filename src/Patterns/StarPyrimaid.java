package Patterns;

import java.util.Scanner;

public class StarPyrimaid {
    static void Star(int n)
    {
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");

            }
            for (int a = 1; a <=i ; a++) {
                System.out.print("*"+" ");
            }
            System.out.println("");


        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        Star(n);

    }
}
