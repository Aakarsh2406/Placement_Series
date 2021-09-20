package DSA_MATHS;

public class Traling_Zeros {
    static  int Zeros(int n)
    {
        int res=0;
        for (int i = 5; i <=n ; i=i*5) {
            res=res+n/i;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(Zeros(100));
    }
}
