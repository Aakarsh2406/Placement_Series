package Stack;

import java.util.Stack;

public class PalindromeNumber {
   static boolean isPalindrome(int x)
    {
        Stack<Character> stack=new
                Stack<>();
        String no=Integer.toString(x);

        char ch;
        for (int i = 0; i < no.length(); i++) {
            ch=no.charAt(i);
            stack.push(ch);
        }
        String out = "";
        while (!stack.isEmpty())
        {
            out=out+stack.pop();
        }
        System.out.println(out);
        System.out.println(no);
        if(out.equals(no))
        {
            return  true;
        }
return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
