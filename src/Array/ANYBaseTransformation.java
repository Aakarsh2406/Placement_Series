package Array;

public class ANYBaseTransformation {


    public static void toBinary(int decimal,int b){
        int base[] = new int[40];
        int index = 0;
        while(decimal > 0){
            base[index++] = decimal%b;
            decimal = decimal/b;
        }
        for(int i = index-1;i >= 0;i--){
            System.out.print(base[i]);
        }
        System.out.println();//new line
    }


    public static void main(String[] args)
        {
            toBinary(342,7);
        }
    }


