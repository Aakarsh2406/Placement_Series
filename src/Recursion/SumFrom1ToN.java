package Recursion;

public class SumFrom1ToN {
    public int sum (int n) {
        if (n == 0)return 0;
       return sum(n-1)+n;
    }

    public static void main(String[] args) {
        int n=6;
        SumFrom1ToN obj=new SumFrom1ToN();
        System.out.println(obj.sum(n));
    }
}
