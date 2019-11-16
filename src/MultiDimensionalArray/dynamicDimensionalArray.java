package MultiDimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class dynamicDimensionalArray {
    public static void main(String[] args) {
        Random random = new Random();
        int [] [] nums = wednesdayDimensionalArray.methodName(3 ,5);
        System.out.println(Arrays.deepToString(nums));
    }



    public static int  diagonalTwoDArray(int [] [] arr) {
int sumOne =0;
int sumTwo=0;

        for (int i = 0, j= arr.length -1; i < arr.length; i++,j--){

                sumOne += arr[i][i];
                sumTwo += arr[j][i];


            }



      return Math.abs(sumOne - sumTwo);


    }

}
