package Babies;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  number one : ");
        double number = input.nextDouble();
        System.out.println("Please enter  number two : ");
        double number1 = input.nextDouble();
        input.nextLine();
        System.out.println("Please enter operators : ");
        String Operators =input.nextLine();

        boolean valid = true;


        switch (Operators){

            case " + ":
                result = number + number1;
                break;

            case " - ":
            result = number-number1;
            break;

            case " * ":
            result = number*number1;
            break;

            case " / ":

            result = number/ number1;
            break;

            default:
                System.out.println("Invalid operator");
                valid = false;


            if (valid) {

                System.out.println( number + Operators + number1 + " = " + result );
            }




        }




    }


}
