package Strings;

public class palindrome {
    static int isPlaindrome(String str){
        StringBuilder check=new StringBuilder(str);
        StringBuilder temp=new StringBuilder(str);
        System.out.println(check.reverse());
        System.out.println(temp);
        if (check.reverse()==temp)
        {
            return 1;}

        else return 0;
    }

    public static void main(String[] args) {
        String str="A man, a plan, a canal: Panama";
        System.out.println(isPlaindrome(str));
    }
}
