package Scanners;

import java.util.Scanner;

public class ThirdScanner {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

                System.out.println( "Month :");
                int month = input.nextInt();
                System.out.println( "Day :");
                int day = input.nextInt ();
                System.out.println( "Year :");
                int year = input.nextInt();


        year+=5;
        day-=1;

        String result2 = "" + month + "/" + day + "/" + year;
        System.out.println(result2);







    }


}
