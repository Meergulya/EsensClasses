package MultiDimensionalArray;

public class biggestNumberDimensional {

    public static void main(String[] args) {
       int [] [] arr = {{78,56,6456,23},{45,6,89,90},{1200,34,567,8769,5}};

        System.out.println(biggestNumber(arr));

    }

    public static int biggestNumber(int[][] twoDarr) {
        int biggest = twoDarr[0][0];

        for (int i = 1; i < twoDarr.length; i++) {


            for (int j = 0; j < twoDarr[i].length; j++) {

                if (twoDarr[i][j] > biggest) {
                    biggest = twoDarr[i][j];
                }


            }


        }
return biggest;
    }


}















