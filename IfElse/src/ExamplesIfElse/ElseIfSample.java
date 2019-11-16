package ExamplesIfElse;

import java.util.Scanner;

public class ElseIfSample {

    public static void main(String[] args) {

            Scanner input=new Scanner(System.in);

            int passCode=65471;

        System.out.println("Enter your user code :");

        int userCode=input.nextInt();
        if (userCode==passCode) {
            System.out.println( " Welcome to iPhone !");

        }

        else if  (userCode > passCode) {

            System.out.println("No negative numbers");
        }



            else if ( userCode<passCode) {

            System.out.println("You entered less digits");
        }



           else if (userCode > passCode ) {

            System.out.println("You entered more digits");
        }



        else{
            System.out.println("Try again later");
        }




        }





    }






