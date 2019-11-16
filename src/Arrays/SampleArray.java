package Arrays;

import java.util.Arrays;
import java.util.Scanner;


public class SampleArray {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {"hello", "why", "by", "apple", "note"};
//        {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

//        String [] names = new String[4];
//         names [0] = "Leonie";
//         names [1] = "victroia";
//         names [2] = "Julianne";
//         names [3] = "Fiona";

        System.out.println(Arrays.toString(words));

//        System.out.println(names[1].charAt(0));
//        System.out.println(names[2].charAt(0));
//        names[1] = names[1].substring(0,1).toUpperCase() + names[1].substring(1).toLowerCase();
//        System.out.println(names[1]);
//


        for (int i = 0; i < words.length; i++) {

            String ready = words[0].substring(0, 1) + words[0].substring(words[0].length() - 1);
            String ready1 = words[1].substring(0, 1) + words[1].substring(words[1].length() - 1);
            String ready2 = words[2].substring(0, 1) + words[2].substring(words[2].length() - 1);
            String ready3 = words[3].substring(0, 1) + words[3].substring(words[3].length() - 1);
            String ready4 = words[4].substring(0, 1) + words[4].substring(words[4].length() - 1);

            System.out.println(ready + " ");
            System.out.println(ready1 + " ");
            System.out.println(ready2 + " ");
            System.out.println(ready3 + " ");
            System.out.println(ready4 + " ");
            break;

        }
//        //Scanner input = new Scanner(System.in);
//        String[] arr = new String[5];
//        for (int i = 0; i < 5; i++) {
//
//            arr[i] = input.nextLine();
//
//
//            if (arr[i].length() > 3){
//                System.out.println(arr[i].substring(0,3));
//        }


    }

}
