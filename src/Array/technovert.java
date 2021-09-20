package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class technovert {
    public static void main(String[] args) throws java.lang.Exception {


        // your code goes here
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n==0)
            return;
        if(n==5)
            arr[5]=1;
        if(n<10)
        {

            int x=n%5;
            if(x<5)
            {
                int i=9;
                while(x>0)
                {

                    arr[i]=1;
                    i--;
                    x--;
                }
                arr[5]=1;
            }
            else if(x>5)
            {
                int y=x%5;
                int i=9;

                while (y>0)
                {
                    arr[i]=1;
                    i--;
                    y--;
                }
            }

        }
        else {
            if(n==10)
                arr[0]=1;
            int x=n/10;
            int q=n%10;
            if(x>5)
            {


                int i=0;
                int y=x%5;
                while (y>0)
                {
                    arr[i]=1;
                    i++;
                    y--;
                }
                arr[4]=1;
            }
            if(q<10 && q!=0)
            {

                int x1=q%5;
                if(x1<5)
                {
                    int i=9;
                    while(x1>0)
                    {

                        arr[i]=1;
                        i--;
                        x1--;
                    }
                    arr[5]=1;
                }
                else if(x>5)
                {
                    int y=x%5;
                    int i=9;

                    while (y>0)
                    {
                        arr[i]=1;
                        i--;
                        y--;
                    }
                }

            }
        }


        System.out.println(Arrays.toString(arr));
    }

}
