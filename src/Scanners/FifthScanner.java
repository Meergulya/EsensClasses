package Scanners;

import java.util.Scanner;

public class FifthScanner {


    public static void main(String[] args) {

                Scanner input =new Scanner (System.in);


                System.out.println(" Please enter the minutes :");
                int mins= input.nextInt ()
        ;
                int hours= mins/60;
                int remaindingMinutes = mins%60;



        System.out.println(mins + "minute is" + hours + "hours and" + remaindingMinutes + "minutes");








    }


}



