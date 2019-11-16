package MultiDimensionalArray;

import java.util.Arrays;
import java.util.Random;

public class wednesdayDimensionalArray {
    public static void main(String[] args) {
        Random random=new Random();
        System.out.println(Arrays.deepToString(methodName(4 , 5)));
    }

public static int [][] methodName(int num1,int num2) {
    Random random = new Random();
    int[][] arr = new int[num1][num2];
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {

            arr[i][j] = random.nextInt(100);
        }

    }
    return arr;

}













}
