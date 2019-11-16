package FirstPackage;

import java.util.Scanner;

public class TotalNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println(" Enter the number");
        int number = input.nextInt();

        char letter = 'y';
        char let = 'n';
        int positive = 0;
        int negative = 0;
        int zero = 0;

        do {

                System.out.println("Would you like to continue ");
                letter= input.next().charAt(0);


                if (number < 0) {
                    negative++;
                    System.out.println(" Negative numbers : " + negative);
                }
                if (number > 0) {
                    positive++;
                    System.out.println(" Positive numbers : " + positive);
                }

                if (number == 0) {

                    zero++;
                    System.out.println(" Zero numbers : " + zero);
                }


        } while (number == let) ;




    }

}