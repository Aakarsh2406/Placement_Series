package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Combinations {
    static List<List<Integer>> arr;

    public List<List<Integer>> combine(int n, int k) {
        arr=new ArrayList<>();
        support(n, k, 1, new ArrayList<Integer>());
        return arr;
    }

    public List<Integer> support(int n, int k, int currentVal, List<Integer> individualComb) {

        if (individualComb.size() == k) {
            arr.add(individualComb);
            return individualComb;
        }
        if (currentVal > n)
            return individualComb;
        List<Integer> newArr =new ArrayList<>(individualComb);
        newArr.add(currentVal);
        support(n, k, currentVal + 1, newArr);
        support(n, k, currentVal + 1, individualComb);
        return individualComb;
    }

    public static void main(String[] args) {
       Combinations obj=new Combinations();
        System.out.println(obj.combine(4,3));
    }
}
