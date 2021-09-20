package DSA_MATHS;

import java.util.Arrays;

public class Sieve_Of_Eratothenes {
     static boolean [] isPrime(int n)
     {
         boolean check[]=new boolean[n+1];
         Arrays.fill(check,true);
         check[0]=check[1]=false;
         for (int i = 2; i*i <=n ; i++) {
             for (int j = 2*i; j <=n; j+=i) {
                 check[j]=false;

             }

         }
         return check;
     }

    public static void main(String[] args) {
        boolean arr[]=isPrime(20);
        for (int n = 0; n <= 20; n++) {
            System.out.println(n+" "+arr[n]);
        }
    }

}
