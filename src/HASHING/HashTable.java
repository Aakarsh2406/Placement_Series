package HASHING;

import java.util.Hashtable;

public class HashTable {
    public  static int hash(String str)
    {
        int hashvalue = 0;
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch=str.charAt(i);
            hashvalue = ch;
            hashvalue+=hashvalue<<10;
            hashvalue^=hashvalue>>6;
        }
        hashvalue+=(hashvalue<<3);
        hashvalue+=(hashvalue>>11);

        hashvalue+=(hashvalue<<15);


        return hashvalue % 10;
    }


    public static void main(String[] args) {


        Hashtable<Integer,String> h=new
                Hashtable(10);
        h.put(hash("aakarsh"),"check");
        h.put(hash("aakarshsinghgangwar"),"check");

        System.out.println(h);
        // System.out.println(obj.hash("aakarshsinghgangwar"));

    }
}
