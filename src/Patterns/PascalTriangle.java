package Patterns;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> row1 = new ArrayList<>();
        row1.add(1);
        ans.add(row1);
        for (int i = 1; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                int temp = ((j - 1 >= 0) ? ans.get(i - 1).get(j - 1) : 0)
                        + ((j != i) ? ans.get(i - 1).get(j) : 0);
                row.add(temp);
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        int numrows=5;
        PascalTriangle obj=new PascalTriangle();
        System.out.println(obj.generate(numrows));
    }
}
