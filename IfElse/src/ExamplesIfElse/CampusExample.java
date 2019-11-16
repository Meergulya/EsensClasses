package ExamplesIfElse;

import java.util.Scanner;

public class CampusExample {

    public static void main(String[] args) {

       Scanner input =new Scanner(System.in);

        boolean check;
        int time;
        System.out.println( "Enter the time : " );
        time = input.nextInt();




        if (time >= 8 && time <= 23 ){
                    check=true;
            System.out.println( "Open");
        }else{
                    check=false;
            System.out.println("Closed");
        }

    if (check)  {

        System.out.println("Campus is open");
    }else{

    }

        if (time<0 || time>=24) {
            System.out.println( "Invalid time");
        }






    }








}
