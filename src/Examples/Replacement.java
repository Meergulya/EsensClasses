package Examples;

import java.util.Arrays;

public class Replacement {

    public static void main(String[] args) {



        String message=" How are \"you\" ?";
        String sample =  "Where: \\are\\you: ?";
        String example= "Why \n are \"you\" \\laughing\\";
        String again = "Welcome \"back home\"";
        System.out.println(message);
        System.out.println(message.length());
        System.out.println(message.indexOf("a"));
        System.out.println(message.replace ( "?","!"));
        System.out.println(message.replace ("h" , "w"));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim());
        System.out.println(message);
        System.out.println(message.trim());
        System.out.println(message);
        System.out.println(sample);

        System.out.println(example);
        System.out.println(again);

        int[][]numbers= { { 1,2,3 }, { 4,5,6 } };
        //System.out.println(numbers);
        System.out.println(Arrays.deepToString(numbers));




    }



}
