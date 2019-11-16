package ExamplesIfElse;

import java.util.Scanner;

public class Calculator {


         public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        input.nextLine();
        System.out.println("Please choose operator below  + , - , * , / ");
        String operator = input.nextLine();


        if (operator.equals ("*")){

            System.out.println( "Result of " + number1 + operator + number2 + " is : " + (number1 * number2));
        }

        else if (operator.equals(" - ")) {

            System.out.println( "Result of " + number1 + operator + number2 + " is : " + (number1 - number2));
        }

        else if (operator.equals( " + ")) {

            System.out.println( "Result of " + number1 + operator + number2 + " is : " + (number1 + number2));
        }

        else if (operator.equals( " / ")) {

            System.out.println( "Result of " + number1 + operator + number2 + " is : " + (number1 / number2));
        }



         }




}
