package DP;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumCostToTravelWorld {
    public static int minimumCost(int n, int[][] cost) {
        if (n == 0 || cost == null || cost.length == 0)
            return 0;
        int lastTransport = -1;
        int minCost = 0;
        for (int i = 0; i < n; i++) {
            int curMinCost = Integer.MAX_VALUE;
            int curIdx = 0;
            for (int j = 0; j < 3; j++) {
                if(j !=lastTransport && cost[i][j] < curMinCost) {
                    curIdx = j;
                    curMinCost = cost[i][j];
                }
            }
            lastTransport = curIdx;
            minCost += cost[i][lastTransport];
        }

        return minCost;
    }
    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        int cost[][]=new int[n][3];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <3 ; j++) {
                cost[i][j]=in.nextInt();
            }

        }
       // print2D(cost);
        System.out.println(minimumCost(n,cost));

    }
}
