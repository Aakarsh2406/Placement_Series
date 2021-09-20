package Patterns;

import java.util.ArrayList;
import java.util.List;

public class SpiralPattern {
    static List<Integer> Spiral(int Matrix[][])
    {
        List<Integer> list=new ArrayList<>();
        int row=Matrix.length;
        int col=Matrix[0].length;
        if(row==0)
            return  list;

        int t=0,l=0,r=col-1,b=row-1,d=0;
        while(l<=r && t<=b)
        {
            if(d==0)
            {
                for(int i=l;i<=r;i++)
                {
                    list.add(Matrix[t][i]);
                }
                d=1;
                t++;
            }
            else if(d==1)
            {
                for(int i=t;i<=b;i++)
                {
                    list.add(Matrix[i][r]);
                }
                r--;
                d=2;
            }
            else if(d==2){
                for(int i=r;i>=l;i--)
                {
                    list.add(Matrix[b][i]);
                }
                b--;
                d=3;
            }
            else if(d==3)
            {
                for(int i=b;i>=t;i--)
                {
                    list.add(Matrix[i][l]);
                }
                d=0;
                l++;

            }

        }
        return list;

    }

    public static void main(String[] args) {
        int matrix[][]={{1,2,3},{5,6,7},{9,10,11}};
        System.out.println(Spiral(matrix));
    }
}
