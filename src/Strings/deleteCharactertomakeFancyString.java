package Strings;

public class deleteCharactertomakeFancyString {
  static String delete(String s)
    {
        char ch;
        int count=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length()-1; j++) {
                ch=s.charAt(i);
                if(ch==s.charAt(j))
                    count++;
                if(count==3)
                   s= s.substring(i);
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(  delete("aaabaaa"));
    }
}
