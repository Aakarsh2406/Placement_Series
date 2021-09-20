package Array;

class EvenNoOfDigitsInNumber {
    static int count(int arr[])
    {
        int count=0;
        for (int ch :
                arr) {
            if(even(ch))
                count++;

        }
       // System.out.println(2>>1);
        return count;
    }

    public static boolean even(int ch) {
        String str=Integer.toString(ch);
      //  System.out.println(str);
        int len=str.length();
       // System.out.println(len);
        if(len%2==0)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        int arr[]={12,2,1,3,7890};
        System.out.println(count(arr));
    }
}
