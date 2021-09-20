package Patterns;

public class hourglass {
    static void pattern(int rows_no)
    {
        int i, j, k;
        for (i = 1; i <= rows_no; i++) {
            for (k = 1; k < i; k++)
                System.out.print(" ");
            for (j = i; j <= rows_no; j++)
                System.out.print("*" + " ");
            System.out.println();
        }
        for (i = rows_no - 1; i >= 1; i--)
        {
            for (k = 1; k < i; k++)
                System.out.print(" ");
            for (j = i; j <= rows_no; j++)
                System.out.print("*" + " ");
            System.out.println();
        }
    }
    public static void main (String[] args)
    {
        int rows_no = 5;
        pattern(rows_no);

    }
}
