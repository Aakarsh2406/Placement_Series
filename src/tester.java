public class tester {
    static int test(int x, int y)

    {
       if(x>y)
           return test(y,x);
       else if(y!=0)
       {
           int z=test(x,y-1);
           z=z+x;
           return z;
       }
       else return 0;
    }

    public static void main(String[] args) {
        System.out.println( test(10,7));
    }
}
