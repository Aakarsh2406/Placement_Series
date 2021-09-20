package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    static  int[][] merge(int [][] intervals)
    {
        List<int []>res=new ArrayList<>();
        if(intervals.length==0 ||intervals==null)
        {

            return res.toArray(new int[0][]);
        }
        Arrays.sort(intervals, (i1, i2) -> (i1[0]-i2[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for (int[] i :
                intervals) {
            if(i[0]<=end)
            {

                end=Math.max(end,i[1]);
            }
            else {
                res.add(new int[] {start,end});
                start=i[0];
                end=i[1];
            }

        }
        res.add(new int[] {start,end});
        return res.toArray(new int[0][]);
    }

    public static void main(String[] args) {
       int intervals[][] = {{1,3},{2,6},{10,8},{15,18}};
     //   System.out.println(Arrays.toString(merge(intervals)));
        int anerr[][]=merge(intervals);
        for (int i = 0; i < intervals.length-1; i++) {
            for (int j = 0; j < intervals.length-1; j++) {
                System.out.println(anerr[i][j]);

            }

        }

    }
}
