package Arrays;

import java.util.Arrays;

public class MultiDimensional {


    public static void main(String[] args) {



        String [][] two = {{"Cow","Horse","Dog","Cat","Chicken"},{"Tiger","Lion","Snake","Zebra","Elephant"}};


        System.out.println(two.length);
        System.out.println(two[0].length);
        System.out.println(two[1].length);
        System.out.println(two[0][1].toUpperCase());
        System.out.println(Arrays.deepToString(two));







    }





}
