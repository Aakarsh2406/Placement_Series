package Recursion;

import java.util.Scanner;

public class SumOfDigits {
    int sum_D(int n) {
        if (n == 0)
            return 0;
      //  System.out.println(n%10);
        return sum_D(n / 10) +(n % 10);
    }

    public static void main(String[] args) {
     SumOfDigits obj=new SumOfDigits();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Number");
        System.out.println(obj.sum_D(in.nextInt()));
    }
}
/* explanation:
sum=12134=> 1213+4
where 1213=n/10;
4=n%10;
 */