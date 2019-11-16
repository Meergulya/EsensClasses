package ExamplesIfElse;

import java.util.Scanner;

public class OddExample {

    public static void main(String[] args) {


      Scanner input = new Scanner(System.in);
//
//        System.out.println("Please enter integer");
//
//        int number = input.nextInt();
//        if (number % 2 == 0) {
//
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }


        System.out.println("Enter five integers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();
        int number4 = input.nextInt();
        int number5 = input.nextInt();
        int evens=0;
        int odds=0;

        if (number1 % 2 == 0) {
           evens++;
        }else{
            odds++;
        }
         if (number2 % 2 == 0) {
             evens++;

        }else{
             odds++;
         }
         if (number3 % 2 == 0) {
             evens++;
         }else{
             odds++;
         }
         if ( number4 % 2 == 0){
             evens++;
         }else{
             odds++;
         }
         if ( number5 % 2 == 0){
             evens++;
         }else{
             odds++;
         }


        System.out.println("Total even numbers: " + evens);
        System.out.println("Total odd numbers: " + odds);


    }


      }
