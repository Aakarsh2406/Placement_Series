package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class tcs {
    static  void check(int N
    ,int s)
    {
        int count=0;
        //String result[]=new String[50];\
        ArrayList<String> result=new
                ArrayList<>();
        String check1=Integer.toString(s);
        int j=0;
        for (int i = 0; i <=N; i++) {
            String str=Integer.toString(i);
            if(str.contains(check1))
            {

                count++;
                result.add(Integer.toString(i));
                j++;
            }


        }
       result.add(Integer.toString(count));

        for (String str :
                result) {
            System.out.println(str+" ");
        }
        //System.out.println(result.toString());
    }

    public static void main(String[] args) {
        check(20,0);
    }
}
