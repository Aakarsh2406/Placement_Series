package Strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LongestPrefix {
    static  String prefix(String str[])
    {

        String count="";
        Set<String> set1=new HashSet<>(Arrays.asList(str));
    //    Set<Integer> set2=new HashSet<>(Arrays.asList(arr1));

        return count;
    }

    public static void main(String[] args) {
        String[] name = {"flower","flow","flight"};
        String finalString="";
        for (String str :
                name) {

            finalString+=str;
        }
        HashSet<String> set=new HashSet<String>(Collections.singleton("flower"));
        HashSet<String> set1=new HashSet<String>(Collections.singleton("flight"));
        for (String str :
                set) {
            if (set1.contains(str))
                System.out.println(str);
        }
        System.out.println(set);
       // prefix(args);
    }

}
