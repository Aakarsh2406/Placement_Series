package Strings;

public class slidingWindow {
        static long printIndex(String str, String s)
        {
            long res=0;
            boolean flag = false;
            for (int i = 0; i < str.length() - s.length()+1 ; i++) {
                if (str.substring(i, i + s.length()).equals(s)) {
                     res=res*10+(i+1);
                    flag = true;
                }
            }
            if (flag==true)
                return res;
            else
                return -1;
        }
        public static void main(String[] args)
        {
            String str1 = "abcdefabc";
            String str2 = "a#bc";
           str2= str2.replace('#',' ');
           str2= str2.trim();

           str2=str2.replaceAll("\\s", "");


            System.out.println(printIndex(str1, str2));
        }
    }




