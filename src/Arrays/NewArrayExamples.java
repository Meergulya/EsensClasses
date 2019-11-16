package Arrays;

import java.util.Arrays;
import java.util.Random;

public class NewArrayExamples {

    public static void main(String[] args) {


        Random random = new Random();

        int [] arr = new int [50];
        for (int i =0; i<arr.length; i++) {
            arr[i] = random.nextInt(100) +1;

        }

        System.out.println(Arrays.toString(arr));




    }



}
