package Array;

public class NumberOFEvenDigitsInArray {
    static public int findNumbers(int[] nums) {
        int count = 0;

        for (int value :
                nums) {
            int length = Integer.toString((value)).length();
            if ((length & 1) == 0)
                count++;

        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
}
