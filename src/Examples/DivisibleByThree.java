package Examples;

import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {


        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {


                System.out.println(i);

            }

        }

        int x = 0;

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {

                x += i;
                System.out.println(x);


            }
        }


        for (int i = 1; i <= 20; i++) {
       String y = "";


            System.out.print(  i  + " +  " + y );

        }


//        Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
//        Ask for the first guest name.
//        Then ask does user want to enter one more guest.
//        If yes - take input from.
//        If not - finish the program and print list of the guests.
//
//        Example of the program:
//
//        Please enter guest name:
//        Nick
//        Do you want to enter new guest name:
//        yes
//        Please enter guest name:
//        Linda
//        Do you want to enter new guest name:
//        no
//
//        Guest's list: Nick, Linda


        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter the guest name ");
        String name = input.nextLine();
        String word = "yes";


        while (word == "yes") {

            System.out.println(" Do you want to enter the new guest name : ");
            word = input.nextLine();
            System.out.println(" Please enter the guest name : ");
             name = input.nextLine();

        }

//        System.out.println(name);

    }

}






