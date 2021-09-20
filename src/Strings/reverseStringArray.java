package Strings;

import java.util.Arrays;

public class reverseStringArray {
   static public void reverseString(char[] s) {
        int j=s.length-1;

        char temp;
        for (int i = 0; i < s.length; i++) {


            if (s[i] != s[j] && i<j ) {
                temp = s[i];
                s[i] = s[j];
                s[j] = temp;






            }
            j--;


        }
       System.out.println(Arrays.toString(s));


    }

    public static void main(String[] args) {
        char arr[]={'A','K','A','R','S','h'};
        reverseString(arr);
    }
}
