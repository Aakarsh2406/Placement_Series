package Recursion;

import java.util.Scanner;

public class FactorialOfNumberN {
    public  int fact_N(int n)
    {
        if(n==0)return 1;
        return fact_N(n-1)*n;
    }

    public static void main(String[] args) {
        FactorialOfNumberN obj=new FactorialOfNumberN();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your Number");
        System.out.println(obj.fact_N(in.nextInt()));
    }
}
/* explanation:
fact= 1+2+3+4+5+6+7
where 1+2+3+4+5+6=n-1;
7=n;
and as we know we have to apply * operator between our n and n-1 where func recursively calls for n-1 segment
 */
