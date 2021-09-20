package DSA_MATHS;

import java.math.BigInteger;

public class Factorial {
    static String fact(int n)
    {
        BigInteger f=new BigInteger("1");
        for (int i = 2; i<=n ; i++) {
            f=f.multiply(BigInteger.valueOf(i));
        }
        return f.toString();
    }

    public static void main(String[] args) {
        System.out.println(fact(13));
    }
}
