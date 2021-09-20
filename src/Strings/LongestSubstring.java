package Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    static int findSubstring(String s) {
        if (s == null || s.equals("")) return 0;
        int left, right, maxlength;
        left = right = maxlength = 0;
        Set<Character> substring = new HashSet<>();
        while (right < s.length()) {
            char ch = s.charAt(right);
            if (substring.add(ch)) {
                right++;
                maxlength = Math.max(maxlength, substring.size());
            } else {
                substring.remove(s.charAt(left));
                left++;
            }
        }
        return maxlength;
    }

    static void singhalsApproach(String inputStr) {
        int[] arr = new int[26];
        Arrays.fill(arr, Integer.MAX_VALUE);
        int maxLength = 0;
        int maxTemp = 0;
        int pointer = 0;
        while (pointer < inputStr.length()) {
            int ascii = inputStr.charAt(pointer);
            int index = ascii - 97;
            if (arr[index] == Integer.MAX_VALUE) {
                maxTemp++;
                pointer++;
                arr[index] = pointer;
            } else {
                maxLength = Math.max(maxTemp, maxLength);
                maxTemp = 0;
                pointer = index + 1;
                pointer++;
            }
        }
        System.out.println(maxLength);
    }

    public static void main(String[] args) {
   singhalsApproach("abcabc");
    }
}
