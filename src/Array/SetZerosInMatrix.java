package Array;

import HASHING.HashTable;

import java.util.Arrays;
import java.util.Hashtable;

public class SetZerosInMatrix {
   static void setZeros(int A[][],int m, int n)
    {
        boolean row[]=new  boolean [m];
        boolean col[]=new boolean[n];
        for (int i = 0; i < m; i++) {
            row[i]=false;
        }
        for (int i = 0; i < n; i++) {
            col[i]=false;
        }
        for(int i = 0;i< m;i++)
        {
            for(int j = 0; j< n;j++)
            {
                if(A[i][j] == 0)
                {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
      //  System.out.println(Arrays.toString(row));
        //System.out.println(Arrays.toString(col));

        for(int i = 0;i< m;i++)
        {
            for(int j = 0; j< n;j++)
            {
                if(row[i] == true || col[j] == true)
                A[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }


    }


    public static void main(String[] args) {
        int mat[][] = { {1, 0, 1, 0, 1, 1},
        {1, 1, 1, 1, 1, 1},
        {1, 1, 1, 1, 1, 1} }; 
        setZeros(mat,mat.length, mat[0].length);


    }
}
