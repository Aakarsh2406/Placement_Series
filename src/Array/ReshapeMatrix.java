package Array;

import java.util.Arrays;

public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] res = new int[r][c];
        int j = 0;
        for (int i = 0; i < m * n; i++) {
            int v = mat[i / n][i % n];
            res[j / c][j % c] = v;
            j++;
        }

        return res;
    }

    public static void main(String[] args) {
        ReshapeMatrix obj=new ReshapeMatrix();
        int arr[][]={{1,2},{3,4}};
        int r=1,c=4;
        int res[][]=obj.matrixReshape(arr,r,c);
        for (int i=0;i<r;i++)
        {
            System.out.println(Arrays.toString(res[i]));
        }
    }
}
