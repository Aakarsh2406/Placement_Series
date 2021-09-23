package Strings;

public class UncommonString {



        static int MAX_CHAR = 26;
        static void findAndPrintUncommonChars(String str1,
                                              String str2)
        {

            int present[] = new int[MAX_CHAR];
            for (int i = 0; i < MAX_CHAR; i++)
            {
                present[i] = 0;
            }

            int l1 = str1.length();
            int l2 = str2.length();

            for (int i = 0; i < l1; i++)
            {
                present[str1.charAt(i) - 'a'] = 1;
            }

            // for each character of str2
            for (int i = 0; i < l2; i++)
            {


                if (present[str2.charAt(i) - 'a'] == 1
                        || present[str2.charAt(i) - 'a'] == -1)
                {
                    present[str2.charAt(i) - 'a'] = -1;
                }

                // else mark its presence as 2
                else
                {
                    present[str2.charAt(i) - 'a'] = 2;
                }
            }

            // print all the uncommon characters
            for (int i = 0; i < MAX_CHAR; i++)
            {
                if (present[i] == 1 || present[i] == 2)
                {
                    System.out.print((char) (i + 'a') + " ");
                }
            }
        }


        public static void main(String[] args)
        {
            String str1 = "absolute";
            String str2 = "abstract";
            findAndPrintUncommonChars(str1, str2);
        }
    }




