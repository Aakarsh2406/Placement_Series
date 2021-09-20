package DSA_MATHS;

public class fast_power {
    static  int power(int a,int b){
        int res=1;
        while (b>0)
        {
            if((b &1)!=0) {
                res=res*a;

            }
            a=a*a;

            b=b>>1;

        }
        return res;
    }


    public static void main(String[] args) {
        System.out.println(power(2,6));
    }
}
