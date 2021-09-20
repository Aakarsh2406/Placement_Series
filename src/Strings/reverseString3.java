package Strings;

public class reverseString3 {
   static public String reverseWords(String s) {
       String arr[]=s.split(" ");
        String res=reverse(arr);
        return res;

    }
  static   public String reverse(String str[])
    {
        String answer="";
        for (String value :
                str) {
            StringBuilder s=new StringBuilder(value);
            s.reverse();
            answer=answer+s+" ";

        }
        return answer.trim();



    }

    public static void main(String[] args) {
        String s="Let's take LeetCode contest";
        System.out.println( reverseWords(s));
    }
}
