package Array;

public class SingleBit {
   static public int hammingWeight(int n) {
        String str=Integer.toBinaryString(n);

        int count=0;
        for (int i = 0; i < str.length(); i++) {
            char ch=str.charAt(i);

            if(((int) ch & 1)==1)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000010000000));
    }
}
